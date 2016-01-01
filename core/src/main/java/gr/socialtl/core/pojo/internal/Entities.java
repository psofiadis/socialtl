
package gr.socialtl.core.pojo.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "hashtags",
    "urls",
    "user_mentions",
    "symbols",
    "media"
})
public class Entities {

    @JsonProperty("hashtags")
    private List<Object> hashtags = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Object> urls = new ArrayList<Object>();
    @JsonProperty("user_mentions")
    private List<UserMention> userMentions = new ArrayList<UserMention>();
    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("media")
    private List<Medium> media = new ArrayList<Medium>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities() {
    }

    /**
     * 
     * @param symbols
     * @param urls
     * @param hashtags
     * @param media
     * @param userMentions
     */
    public Entities(List<Object> hashtags, List<Object> urls, List<UserMention> userMentions, List<Object> symbols, List<Medium> media) {
        this.hashtags = hashtags;
        this.urls = urls;
        this.userMentions = userMentions;
        this.symbols = symbols;
        this.media = media;
    }

    /**
     * 
     * @return
     *     The hashtags
     */
    @JsonProperty("hashtags")
    public List<Object> getHashtags() {
        return hashtags;
    }

    /**
     * 
     * @param hashtags
     *     The hashtags
     */
    @JsonProperty("hashtags")
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * 
     * @return
     *     The urls
     */
    @JsonProperty("urls")
    public List<Object> getUrls() {
        return urls;
    }

    /**
     * 
     * @param urls
     *     The urls
     */
    @JsonProperty("urls")
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    /**
     * 
     * @return
     *     The userMentions
     */
    @JsonProperty("user_mentions")
    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    /**
     * 
     * @param userMentions
     *     The user_mentions
     */
    @JsonProperty("user_mentions")
    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    /**
     * 
     * @return
     *     The symbols
     */
    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    /**
     * 
     * @param symbols
     *     The symbols
     */
    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    /**
     * 
     * @return
     *     The media
     */
    @JsonProperty("media")
    public List<Medium> getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    @JsonProperty("media")
    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
