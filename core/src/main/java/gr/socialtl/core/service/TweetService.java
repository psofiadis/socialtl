package gr.socialtl.core.service;

import gr.socialtl.core.model.db.TweetDBImpl;
import gr.socialtl.core.model.db.dao.TweetDAO;
import gr.socialtl.core.model.dto.TweetDTOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Panagiotis on 1/11/2016.
 */

@Service
@Configurable
@Scope("application")
public class TweetService {

  @Autowired
  TweetDAO tweetDAO;

  public TweetService() {
    System.out.println("For debugging purposes "+ this.getClass());
  }


  @Transactional
  public TweetDBImpl saveTweet(TweetDTOImpl tweetDTO){
    TweetDBImpl tweetDB = tweetDTO.getDBImpl();
    try {
//      return tweetDB;
      return tweetDAO.save(tweetDB);
    }catch(Exception ex){
      System.out.println("Failed to save " + tweetDTO + " with exception " + ex.getStackTrace());
      return  null;
    }
  }
}
