
package gr.socialtl.core.model.dto;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import gr.socialtl.core.model.db.TweetDBImpl;
import gr.socialtl.core.pojo.internal.Entities;
import gr.socialtl.core.pojo.internal.ExtendedEntities;
import gr.socialtl.core.pojo.internal.User;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "created_at",
    "id",
    "id_str",
    "text",
    "source",
    "truncated",
    "in_reply_to_status_id",
    "in_reply_to_status_id_str",
    "in_reply_to_user_id",
    "in_reply_to_user_id_str",
    "in_reply_to_screen_name",
    "user",
    "geo",
    "coordinates",
    "place",
    "contributors",
    "is_quote_status",
    "retweet_count",
    "favorite_count",
    "entities",
    "extended_entities",
    "favorited",
    "retweeted",
    "possibly_sensitive",
    "filter_level",
    "lang",
    "timestamp_ms"
})
public class TweetDTOImpl {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("text")
    private String text;
    @JsonProperty("source")
    private String source;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("user")
    private User user;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("is_quote_status")
    private Boolean isQuoteStatus;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("favorite_count")
    private Integer favoriteCount;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("extended_entities")
    private ExtendedEntities extendedEntities;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("possibly_sensitive")
    private Boolean possiblySensitive;
    @JsonProperty("filter_level")
    private String filterLevel;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("timestamp_ms")
    private String timestampMs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TweetDTOImpl() {
    }

    /**
     * 
     * @param inReplyToUserIdStr
     * @param retweeted
     * @param retweetCount
     * @param extendedEntities
     * @param truncated
     * @param lang
     * @param id
     * @param inReplyToStatusIdStr
     * @param createdAt
     * @param place
     * @param coordinates
     * @param text
     * @param contributors
     * @param filterLevel
     * @param geo
     * @param timestampMs
     * @param inReplyToScreenName
     * @param entities
     * @param idStr
     * @param possiblySensitive
     * @param inReplyToStatusId
     * @param source
     * @param favoriteCount
     * @param favorited
     * @param inReplyToUserId
     * @param user
     * @param isQuoteStatus
     */
    public TweetDTOImpl(String createdAt, BigInteger id, String idStr, String text, String source, Boolean truncated, Object inReplyToStatusId, Object inReplyToStatusIdStr, Object inReplyToUserId, Object inReplyToUserIdStr, Object inReplyToScreenName, User user, Object geo, Object coordinates, Object place, Object contributors, Boolean isQuoteStatus, Integer retweetCount, Integer favoriteCount, Entities entities, ExtendedEntities extendedEntities, Boolean favorited, Boolean retweeted, Boolean possiblySensitive, String filterLevel, String lang, String timestampMs) {
        this.createdAt = createdAt;
        this.id = id;
        this.idStr = idStr;
        this.text = text;
        this.source = source;
        this.truncated = truncated;
        this.inReplyToStatusId = inReplyToStatusId;
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        this.inReplyToUserId = inReplyToUserId;
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        this.inReplyToScreenName = inReplyToScreenName;
        this.user = user;
        this.geo = geo;
        this.coordinates = coordinates;
        this.place = place;
        this.contributors = contributors;
        this.isQuoteStatus = isQuoteStatus;
        this.retweetCount = retweetCount;
        this.favoriteCount = favoriteCount;
        this.entities = entities;
        this.extendedEntities = extendedEntities;
        this.favorited = favorited;
        this.retweeted = retweeted;
        this.possiblySensitive = possiblySensitive;
        this.filterLevel = filterLevel;
        this.lang = lang;
        this.timestampMs = timestampMs;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public BigInteger getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The idStr
     */
    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    /**
     * 
     * @param idStr
     *     The id_str
     */
    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The truncated
     */
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * 
     * @param truncated
     *     The truncated
     */
    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * 
     * @return
     *     The inReplyToStatusId
     */
    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * 
     * @param inReplyToStatusId
     *     The in_reply_to_status_id
     */
    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     * 
     * @return
     *     The inReplyToStatusIdStr
     */
    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     * 
     * @param inReplyToStatusIdStr
     *     The in_reply_to_status_id_str
     */
    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    /**
     * 
     * @return
     *     The inReplyToUserId
     */
    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * 
     * @param inReplyToUserId
     *     The in_reply_to_user_id
     */
    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     * 
     * @return
     *     The inReplyToUserIdStr
     */
    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     * 
     * @param inReplyToUserIdStr
     *     The in_reply_to_user_id_str
     */
    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    /**
     * 
     * @return
     *     The inReplyToScreenName
     */
    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * 
     * @param inReplyToScreenName
     *     The in_reply_to_screen_name
     */
    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The geo
     */
    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    /**
     * 
     * @param geo
     *     The geo
     */
    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The place
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * 
     * @param place
     *     The place
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     * 
     * @return
     *     The contributors
     */
    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    /**
     * 
     * @param contributors
     *     The contributors
     */
    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     * 
     * @return
     *     The isQuoteStatus
     */
    @JsonProperty("is_quote_status")
    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    /**
     * 
     * @param isQuoteStatus
     *     The is_quote_status
     */
    @JsonProperty("is_quote_status")
    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    /**
     * 
     * @return
     *     The retweetCount
     */
    @JsonProperty("retweet_count")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    /**
     * 
     * @param retweetCount
     *     The retweet_count
     */
    @JsonProperty("retweet_count")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     * 
     * @return
     *     The favoriteCount
     */
    @JsonProperty("favorite_count")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    /**
     * 
     * @param favoriteCount
     *     The favorite_count
     */
    @JsonProperty("favorite_count")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    /**
     * 
     * @return
     *     The entities
     */
    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    /**
     * 
     * @param entities
     *     The entities
     */
    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    /**
     * 
     * @return
     *     The extendedEntities
     */
    @JsonProperty("extended_entities")
    public ExtendedEntities getExtendedEntities() {
        return extendedEntities;
    }

    /**
     * 
     * @param extendedEntities
     *     The extended_entities
     */
    @JsonProperty("extended_entities")
    public void setExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
    }

    /**
     * 
     * @return
     *     The favorited
     */
    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * 
     * @param favorited
     *     The favorited
     */
    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * 
     * @return
     *     The retweeted
     */
    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     * 
     * @param retweeted
     *     The retweeted
     */
    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * 
     * @return
     *     The possiblySensitive
     */
    @JsonProperty("possibly_sensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    /**
     * 
     * @param possiblySensitive
     *     The possibly_sensitive
     */
    @JsonProperty("possibly_sensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    /**
     * 
     * @return
     *     The filterLevel
     */
    @JsonProperty("filter_level")
    public String getFilterLevel() {
        return filterLevel;
    }

    /**
     * 
     * @param filterLevel
     *     The filter_level
     */
    @JsonProperty("filter_level")
    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    /**
     * 
     * @return
     *     The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * @return
     *     The timestampMs
     */
    @JsonProperty("timestamp_ms")
    public String getTimestampMs() {
        return timestampMs;
    }

    /**
     * 
     * @param timestampMs
     *     The timestamp_ms
     */
    @JsonProperty("timestamp_ms")
    public void setTimestampMs(String timestampMs) {
        this.timestampMs = timestampMs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TweetDBImpl getDBImpl(){
      TweetDBImpl tweetDB = new TweetDBImpl();
        tweetDB.setCreatedAt(this.getCreatedAt());
        tweetDB.setTweetIdStr(this.getIdStr());
        return tweetDB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TweetDTOImpl tweetDTO = (TweetDTOImpl) o;

        if (createdAt != null ? !createdAt.equals(tweetDTO.createdAt) : tweetDTO.createdAt != null) return false;
        if (id != null ? !id.equals(tweetDTO.id) : tweetDTO.id != null) return false;
        if (idStr != null ? !idStr.equals(tweetDTO.idStr) : tweetDTO.idStr != null) return false;
        if (text != null ? !text.equals(tweetDTO.text) : tweetDTO.text != null) return false;
        if (source != null ? !source.equals(tweetDTO.source) : tweetDTO.source != null) return false;
        if (truncated != null ? !truncated.equals(tweetDTO.truncated) : tweetDTO.truncated != null) return false;
        if (inReplyToStatusId != null ? !inReplyToStatusId.equals(tweetDTO.inReplyToStatusId) : tweetDTO.inReplyToStatusId != null)
            return false;
        if (inReplyToStatusIdStr != null ? !inReplyToStatusIdStr.equals(tweetDTO.inReplyToStatusIdStr) : tweetDTO.inReplyToStatusIdStr != null)
            return false;
        if (inReplyToUserId != null ? !inReplyToUserId.equals(tweetDTO.inReplyToUserId) : tweetDTO.inReplyToUserId != null)
            return false;
        if (inReplyToUserIdStr != null ? !inReplyToUserIdStr.equals(tweetDTO.inReplyToUserIdStr) : tweetDTO.inReplyToUserIdStr != null)
            return false;
        if (inReplyToScreenName != null ? !inReplyToScreenName.equals(tweetDTO.inReplyToScreenName) : tweetDTO.inReplyToScreenName != null)
            return false;
        if (user != null ? !user.equals(tweetDTO.user) : tweetDTO.user != null) return false;
        if (geo != null ? !geo.equals(tweetDTO.geo) : tweetDTO.geo != null) return false;
        if (coordinates != null ? !coordinates.equals(tweetDTO.coordinates) : tweetDTO.coordinates != null)
            return false;
        if (place != null ? !place.equals(tweetDTO.place) : tweetDTO.place != null) return false;
        if (contributors != null ? !contributors.equals(tweetDTO.contributors) : tweetDTO.contributors != null)
            return false;
        if (isQuoteStatus != null ? !isQuoteStatus.equals(tweetDTO.isQuoteStatus) : tweetDTO.isQuoteStatus != null)
            return false;
        if (retweetCount != null ? !retweetCount.equals(tweetDTO.retweetCount) : tweetDTO.retweetCount != null)
            return false;
        if (favoriteCount != null ? !favoriteCount.equals(tweetDTO.favoriteCount) : tweetDTO.favoriteCount != null)
            return false;
        if (entities != null ? !entities.equals(tweetDTO.entities) : tweetDTO.entities != null) return false;
        if (extendedEntities != null ? !extendedEntities.equals(tweetDTO.extendedEntities) : tweetDTO.extendedEntities != null)
            return false;
        if (favorited != null ? !favorited.equals(tweetDTO.favorited) : tweetDTO.favorited != null) return false;
        if (retweeted != null ? !retweeted.equals(tweetDTO.retweeted) : tweetDTO.retweeted != null) return false;
        if (possiblySensitive != null ? !possiblySensitive.equals(tweetDTO.possiblySensitive) : tweetDTO.possiblySensitive != null)
            return false;
        if (filterLevel != null ? !filterLevel.equals(tweetDTO.filterLevel) : tweetDTO.filterLevel != null)
            return false;
        if (lang != null ? !lang.equals(tweetDTO.lang) : tweetDTO.lang != null) return false;
        if (timestampMs != null ? !timestampMs.equals(tweetDTO.timestampMs) : tweetDTO.timestampMs != null)
            return false;
        if (additionalProperties != null ? !additionalProperties.equals(tweetDTO.additionalProperties) : tweetDTO.additionalProperties != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = createdAt != null ? createdAt.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (idStr != null ? idStr.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (truncated != null ? truncated.hashCode() : 0);
        result = 31 * result + (inReplyToStatusId != null ? inReplyToStatusId.hashCode() : 0);
        result = 31 * result + (inReplyToStatusIdStr != null ? inReplyToStatusIdStr.hashCode() : 0);
        result = 31 * result + (inReplyToUserId != null ? inReplyToUserId.hashCode() : 0);
        result = 31 * result + (inReplyToUserIdStr != null ? inReplyToUserIdStr.hashCode() : 0);
        result = 31 * result + (inReplyToScreenName != null ? inReplyToScreenName.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (geo != null ? geo.hashCode() : 0);
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (contributors != null ? contributors.hashCode() : 0);
        result = 31 * result + (isQuoteStatus != null ? isQuoteStatus.hashCode() : 0);
        result = 31 * result + (retweetCount != null ? retweetCount.hashCode() : 0);
        result = 31 * result + (favoriteCount != null ? favoriteCount.hashCode() : 0);
        result = 31 * result + (entities != null ? entities.hashCode() : 0);
        result = 31 * result + (extendedEntities != null ? extendedEntities.hashCode() : 0);
        result = 31 * result + (favorited != null ? favorited.hashCode() : 0);
        result = 31 * result + (retweeted != null ? retweeted.hashCode() : 0);
        result = 31 * result + (possiblySensitive != null ? possiblySensitive.hashCode() : 0);
        result = 31 * result + (filterLevel != null ? filterLevel.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (timestampMs != null ? timestampMs.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TweetDTOImpl{" +
                "createdAt='" + createdAt + '\'' +
                ", id=" + id +
                ", idStr='" + idStr + '\'' +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                ", truncated=" + truncated +
                ", inReplyToStatusId=" + inReplyToStatusId +
                ", inReplyToStatusIdStr=" + inReplyToStatusIdStr +
                ", inReplyToUserId=" + inReplyToUserId +
                ", inReplyToUserIdStr=" + inReplyToUserIdStr +
                ", inReplyToScreenName=" + inReplyToScreenName +
                ", user=" + user +
                ", geo=" + geo +
                ", coordinates=" + coordinates +
                ", place=" + place +
                ", contributors=" + contributors +
                ", isQuoteStatus=" + isQuoteStatus +
                ", retweetCount=" + retweetCount +
                ", favoriteCount=" + favoriteCount +
                ", entities=" + entities +
                ", extendedEntities=" + extendedEntities +
                ", favorited=" + favorited +
                ", retweeted=" + retweeted +
                ", possiblySensitive=" + possiblySensitive +
                ", filterLevel='" + filterLevel + '\'' +
                ", lang='" + lang + '\'' +
                ", timestampMs='" + timestampMs + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
