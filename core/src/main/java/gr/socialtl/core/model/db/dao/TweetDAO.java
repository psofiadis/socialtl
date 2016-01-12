package gr.socialtl.core.model.db.dao;

import gr.socialtl.core.model.db.TweetDBImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Panagiotis on 1/11/2016.
 */
@Repository("tweetRepository")
@Transactional(propagation = Propagation.REQUIRED, value = "transactionManager")
public interface TweetDAO extends JpaRepository<TweetDBImpl, Long> {
}
