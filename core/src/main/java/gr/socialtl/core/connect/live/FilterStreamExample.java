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
import gr.socialtl.core.model.dto.TweetDTOImpl;
import gr.socialtl.core.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Component
public class FilterStreamExample {

    @Autowired
    TweetService tweetService;

    public FilterStreamExample() {
        System.out.println("For debugging purposes "+ this.getClass());
    }

    public void run(String consumerKey, String consumerSecret, String token, String secret) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10000);
        StatusesFilterEndpoint endpoint = new StatusesFilterEndpoint();
        // add some track terms
        endpoint.trackTerms(Lists.newArrayList("AdonisGeorgiadi","Αδων","Αδον","λαβρεντι", "lavrentis","γενικως","honerich","τσιπρας","atsipras","syriza","tsipras","συριζα"));

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
                String inReply = tweetDTO.getInReplyToScreenName() != null ? " in reply to " + tweetDTO.getInReplyToScreenName() : "";
                System.out.println( "Tweet text is "+tweetDTO.getText() + " https://twitter.com/" + tweetDTO.getUser().getScreenName() + "/statuses/" + tweetDTO.getId()+ inReply);
                tweetService.saveTweet(tweetDTO);
            } catch (JsonGenerationException e) {
            e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch(Throwable e){}
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