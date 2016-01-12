package gr.socialtl.core.rest;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import gr.socialtl.core.model.dto.TweetDTOImpl;
import org.apache.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Panagiotis on 1/1/2016.
 */
@RestController
@RequestMapping("/statuses")
@Consumes( MediaType.APPLICATION_JSON )
@Produces( MediaType.APPLICATION_JSON )
public class ProxyResource
{
    private String endpointUrl = "https://api.twitter.com/1.1/statuses/show.json?id=";
    private final String SIGNATURE_METHOD = "HMAC-SHA1";
    private OAuthClientFilter oauthFilter;
    private Client client;

    Logger log = Logger.getLogger(ProxyResource.class);

    public ProxyResource()
    {
        initSSL();
        initClient();
    }

    @RequestMapping(value = "/byid", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public TweetDTOImpl fetchOAuthProtectedData(@RequestParam(value = "id", required = true) BigInteger id)
    {
        initOAuthFilter( "UxCZhTyzPKImEErqgbIatvbI7", "jiP1S6RNY2ZgZkK7R568ieq1xQkomLjTv10m3sM9qHGPkUJyjp" );

        // Let's use the Jersey Client to make the request
        WebResource webResource = getSignedWebResource( endpointUrl + id);
        WebResource.Builder webBuilder = webResource.getRequestBuilder()
                .accept( MediaType.APPLICATION_JSON )
                .type( MediaType.APPLICATION_FORM_URLENCODED_TYPE );

        try
        {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            String msg = webBuilder.get( String.class );
            TweetDTOImpl dto = mapper.readValue(msg, TweetDTOImpl.class);
            return dto;
//            return webBuilder.get( String.class );
        }
        catch( UniformInterfaceException ex )
        {
            log.info(ex.getMessage()+"\n"+ ex.getStackTrace());
//            return ex.getResponse().getEntity( String.class );
        }
        catch(IOException ex){
            log.info(ex.getMessage()+"\n"+ ex.getStackTrace());
        }
        return null;
    }

    /**
     * Get a WebResource instance with the OAuth filter applied
     * @param endpointUrl
     * @return
     */
    public WebResource getSignedWebResource( String endpointUrl )
    {
        WebResource webResource = client.resource( UriBuilder.fromUri( endpointUrl ).build() );
        webResource.addFilter( oauthFilter );
        return webResource;
    }

    /**
     * Initialise the Jersey Client
     */
    private void initClient()
    {
        ClientConfig config = new DefaultClientConfig();
        config.getFeatures().put( JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE );
        config.getClasses().add( JacksonJaxbJsonProvider.class );
        client = Client.create( config );
    }

    /**
     * Initialise the Jersey OAuth Filter with the key and secret
     * @param consumerKey
     * @param consumerSecret
     */
    private void initOAuthFilter( String consumerKey, String consumerSecret )
    {
        OAuthParameters params = new OAuthParameters();

        params.signatureMethod( SIGNATURE_METHOD );
        params.consumerKey( consumerKey );
        params.setVersion("1.0");
        params.nonce();

        OAuthSecrets secrets = new OAuthSecrets();
        secrets.consumerSecret( consumerSecret );

        oauthFilter = new OAuthClientFilter( client.getProviders(), params, secrets );
    }

    /**
     * The purpose of the initialisation method is to modify the SSLContext
     * and provide it to the HttpsURLConnection class. This will allow us to
     * make SSL calls without using a trusted certificate which for testing
     * purposes will suffice.
     */
    public void initSSL()
    {
        try
        {
            SSLContext sc = SSLContext.getInstance("SSL");

            HostnameVerifier hv = new HostnameVerifier() {
                public boolean verify( String urlHostName, SSLSession session ) { return true; }
            };

            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() { return null; }
                public void checkClientTrusted( X509Certificate[] certs, String authType ) {}
                public void checkServerTrusted( X509Certificate[] certs, String authType ) {}
            }};

            sc.init( null, trustAllCerts, new java.security.SecureRandom() );

            SSLSocketFactory sslSocketFactory = sc.getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory(sslSocketFactory);
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
        }
        catch ( Exception e ) {
            // Do some handling
        }
    }
}
