package gr.socialtl.core;

/**
 * Created by Panagiotis on 12/29/2015.
 */
import java.util.Arrays;

import gr.socialtl.core.connect.live.FilterStreamExample;
import gr.socialtl.core.connect.old.Search;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import gr.socialtl.core.connect.old.Search;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

@SpringBootApplication
public class Application {

    static ApplicationContext ctx ;
    public static void main(String[] args) {
        ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        startFilterStream();
//        startSearch();
//        startQuery();
    }

    private static void startFilterStream() {
//      new Executetor().start();
        try {
            ctx.getBean(FilterStreamExample.class).run("UxCZhTyzPKImEErqgbIatvbI7", "jiP1S6RNY2ZgZkK7R568ieq1xQkomLjTv10m3sM9qHGPkUJyjp",
                "4193965217-N6d2Goxq0Iephszuk1AAHW7LGUXpx9bOeKU3GLn", "zUq1XJbkKxWgEwZuIaAFbqntUCt1RDosCQP2wt3P9Gcjh");
        }catch (InterruptedException ex){
            System.out.println("Input stream interrupted" + ex.getStackTrace());
        }
    }

    private static void startQuery() {

    }

    private static void startSearch() {
        Search.run();
    }
}
