package gr.socialtl.core.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by Panagiotis on 1/11/2016.
 */
@Entity
@Table(name = "tweet")
public class TweetDBImpl {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;

//  @JsonProperty("id")
  private BigInteger tweetId;

//  @JsonProperty("created_at")
  private String createdAt;

//  @JsonProperty("id_str")
  private String tweetIdStr;
//  @JsonProperty("text")
  private String text;
//  @JsonProperty("source")
  private String source;
//  @JsonProperty("truncated")
  private Boolean truncated;
//  @JsonProperty("in_reply_to_status_id")
  private String inReplyToStatusId;
//  @JsonProperty("in_reply_to_status_id_str")
  private String inReplyToStatusIdStr;
//  @JsonProperty("in_reply_to_user_id")
  private String inReplyToUserId;
//  @JsonProperty("in_reply_to_user_id_str")
  private String inReplyToUserIdStr;
//  @JsonProperty("in_reply_to_screen_name")
  private String inReplyToScreenName;
//  @JsonProperty("user")
  private String user;
//  @JsonProperty("geo")
  private String geo;
//  @JsonProperty("coordinates")
  private String coordinates;
//  @JsonProperty("place")
  private String place;
//  @JsonProperty("contributors")
  private String contributors;
//  @JsonProperty("is_quote_status")
  private Boolean isQuoteStatus;
//  @JsonProperty("retweet_count")
  private Integer retweetCount;
//  @JsonProperty("favorite_count")
  private Integer favoriteCount;
//  @JsonProperty("entities")
  private String entities;
//  @JsonProperty("extended_entities")
  private String extendedEntities;
//  @JsonProperty("favorited")
  private Boolean favorited;
//  @JsonProperty("retweeted")
  private Boolean retweeted;
//  @JsonProperty("possibly_sensitive")
  private Boolean possiblySensitive;
//  @JsonProperty("filter_level")
  private String filterLevel;
//  @JsonProperty("lang")
  private String lang;
//  @JsonProperty("timestamp_ms")
  private String timestampMs;
//  @JsonIgnore
//  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public TweetDBImpl() {
  }

//  public Map<String, Object> getAdditionalProperties() {
//    return additionalProperties;
//  }
//
//  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
//    this.additionalProperties = additionalProperties;
//  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public BigInteger getTweetId() {
    return tweetId;
  }

  public void setTweetId(BigInteger tweetId) {
    this.tweetId = tweetId;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getTweetIdStr() {
    return tweetIdStr;
  }

  public void setTweetIdStr(String tweetIdStr) {
    this.tweetIdStr = tweetIdStr;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  public String getInReplyToStatusId() {
    return inReplyToStatusId;
  }

  public void setInReplyToStatusId(String inReplyToStatusId) {
    this.inReplyToStatusId = inReplyToStatusId;
  }

  public String getInReplyToStatusIdStr() {
    return inReplyToStatusIdStr;
  }

  public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
    this.inReplyToStatusIdStr = inReplyToStatusIdStr;
  }

  public String getInReplyToUserId() {
    return inReplyToUserId;
  }

  public void setInReplyToUserId(String inReplyToUserId) {
    this.inReplyToUserId = inReplyToUserId;
  }

  public String getInReplyToUserIdStr() {
    return inReplyToUserIdStr;
  }

  public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
    this.inReplyToUserIdStr = inReplyToUserIdStr;
  }

  public String getInReplyToScreenName() {
    return inReplyToScreenName;
  }

  public void setInReplyToScreenName(String inReplyToScreenName) {
    this.inReplyToScreenName = inReplyToScreenName;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getGeo() {
    return geo;
  }

  public void setGeo(String geo) {
    this.geo = geo;
  }

  public String getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(String coordinates) {
    this.coordinates = coordinates;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getContributors() {
    return contributors;
  }

  public void setContributors(String contributors) {
    this.contributors = contributors;
  }

  public Boolean getQuoteStatus() {
    return isQuoteStatus;
  }

  public void setQuoteStatus(Boolean quoteStatus) {
    isQuoteStatus = quoteStatus;
  }

  public Integer getRetweetCount() {
    return retweetCount;
  }

  public void setRetweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
  }

  public Integer getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public String getEntities() {
    return entities;
  }

  public void setEntities(String entities) {
    this.entities = entities;
  }

  public String getExtendedEntities() {
    return extendedEntities;
  }

  public void setExtendedEntities(String extendedEntities) {
    this.extendedEntities = extendedEntities;
  }

  public Boolean getFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  public Boolean getRetweeted() {
    return retweeted;
  }

  public void setRetweeted(Boolean retweeted) {
    this.retweeted = retweeted;
  }

  public Boolean getPossiblySensitive() {
    return possiblySensitive;
  }

  public void setPossiblySensitive(Boolean possiblySensitive) {
    this.possiblySensitive = possiblySensitive;
  }

  public String getFilterLevel() {
    return filterLevel;
  }

  public void setFilterLevel(String filterLevel) {
    this.filterLevel = filterLevel;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(String timestampMs) {
    this.timestampMs = timestampMs;
  }
}
