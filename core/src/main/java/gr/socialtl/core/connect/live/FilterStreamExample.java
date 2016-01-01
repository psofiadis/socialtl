package gr.socialtl.core.connect.live;

/**
 * Created by Panagiotis on 12/29/2015.
 */
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;
import gr.socialtl.core.pojo.TweetDTOImpl;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FilterStreamExample {

    public static void run(String consumerKey, String consumerSecret, String token, String secret) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10000);
        StatusesFilterEndpoint endpoint = new StatusesFilterEndpoint();
        // add some track terms
        endpoint.trackTerms(Lists.newArrayList("AdonisGeorgiadi", "λαβρεντι", "lavrentis","kmitsotakis","τσιπρας","μειμαρακης","ΝΔ","Κυριακος","κουλη","Αδωνι","αντωναρος","metonkyriako","atsipras","Ευριπίδης","βουλευτικη"));

        Authentication auth = new OAuth1(consumerKey, consumerSecret, token, secret);
        // Authentication auth = new BasicAuth(username, password);

        // Create a new BasicClient. By default gzip is enabled.
        Client client = new ClientBuilder()
                .hosts(Constants.STREAM_HOST)
                .endpoint(endpoint)
                .authentication(auth)
                .processor(new StringDelimitedProcessor(queue))
                .build();

        // Establish a connection
        client.connect();

        // Do whatever needs to be done with messages
        for (int msgRead = 0; msgRead < 10000; msgRead++) {
            ObjectMapper mapper = new ObjectMapper();
            String msg = queue.take();
            try {
                TweetDTOImpl tweetDTO = mapper.readValue(msg, TweetDTOImpl.class);

                System.out.println("ID: "+tweetDTO.getId()+"  Tweet text is "+tweetDTO.getText() + " user " + tweetDTO.getUser().getName() + " in reply to " + tweetDTO.getInReplyToScreenName());
            } catch (JsonGenerationException e) {
            e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        client.stop();

    }

//  public static void main(String[] args) {
//    try {
//      FilterStreamExample.run(args[0], args[1], args[2], args[3]);
//    } catch (InterruptedException e) {
//      System.out.println(e);
//    }
//  }
}