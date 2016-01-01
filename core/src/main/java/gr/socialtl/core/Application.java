package gr.socialtl.core;

/**
 * Created by Panagiotis on 12/29/2015.
 */
import java.util.Arrays;

import gr.socialtl.core.connect.live.FilterStreamExample;
import gr.socialtl.core.connect.old.Search;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import gr.socialtl.core.connect.old.Search;

@SpringBootApplication
public class Application {
    static Logger log = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

//        startFilterStream();
//        startSearch();
        startQuery();
    }

    private static void startQuery() {
        Search.run();
    }

    private static void startSearch() {

    }

    private static void startFilterStream() {
        try {
            FilterStreamExample.run("UxCZhTyzPKImEErqgbIatvbI7", "jiP1S6RNY2ZgZkK7R568ieq1xQkomLjTv10m3sM9qHGPkUJyjp",
                    "4193965217-N6d2Goxq0Iephszuk1AAHW7LGUXpx9bOeKU3GLn", "zUq1XJbkKxWgEwZuIaAFbqntUCt1RDosCQP2wt3P9Gcjh");
        }catch (InterruptedException ex){
           log.error("Input stream interrupted" + ex.getStackTrace());
        }
    }

}
