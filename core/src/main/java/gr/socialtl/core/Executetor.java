package gr.socialtl.core;

import gr.socialtl.core.connect.live.FilterStreamExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;

/**
 * Created by Panagiotis on 1/11/2016.
 */
@Configurable
public class Executetor {

  @Autowired
  FilterStreamExample filterStreamExample;

  private Logger log = Logger.getLogger(Application.class);

  public void start() {
    try {
      filterStreamExample.run("UxCZhTyzPKImEErqgbIatvbI7", "jiP1S6RNY2ZgZkK7R568ieq1xQkomLjTv10m3sM9qHGPkUJyjp",
          "4193965217-N6d2Goxq0Iephszuk1AAHW7LGUXpx9bOeKU3GLn", "zUq1XJbkKxWgEwZuIaAFbqntUCt1RDosCQP2wt3P9Gcjh");
    }catch (InterruptedException ex){
      log.error("Input stream interrupted" + ex.getStackTrace());
    }
  }
}
