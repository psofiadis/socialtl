
package gr.socialtl.core.pojo.internal;

import java.math.BigInteger;
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
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "id_str",
    "indices",
    "media_url",
    "media_url_https",
    "url",
    "display_url",
    "expanded_url",
    "type",
    "sizes"
})
public class Medium {

    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("indices")
    private List<Integer> indices = new ArrayList<Integer>();
    @JsonProperty("media_url")
    private String mediaUrl;
    @JsonProperty("media_url_https")
    private String mediaUrlHttps;
    @JsonProperty("url")
    private String url;
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonProperty("expanded_url")
    private String expandedUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("sizes")
    private Sizes sizes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Medium() {
    }

    /**
     * 
     * @param sizes
     * @param displayUrl
     * @param id
     * @param mediaUrl
     * @param indices
     * @param type
     * @param expandedUrl
     * @param url
     * @param mediaUrlHttps
     * @param idStr
     */
    public Medium(BigInteger id, String idStr, List<Integer> indices, String mediaUrl, String mediaUrlHttps, String url, String displayUrl, String expandedUrl, String type, Sizes sizes) {
        this.id = id;
        this.idStr = idStr;
        this.indices = indices;
        this.mediaUrl = mediaUrl;
        this.mediaUrlHttps = mediaUrlHttps;
        this.url = url;
        this.displayUrl = displayUrl;
        this.expandedUrl = expandedUrl;
        this.type = type;
        this.sizes = sizes;
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
     *     The indices
     */
    @JsonProperty("indices")
    public List<Integer> getIndices() {
        return indices;
    }

    /**
     * 
     * @param indices
     *     The indices
     */
    @JsonProperty("indices")
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    /**
     * 
     * @return
     *     The mediaUrl
     */
    @JsonProperty("media_url")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * 
     * @param mediaUrl
     *     The media_url
     */
    @JsonProperty("media_url")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * 
     * @return
     *     The mediaUrlHttps
     */
    @JsonProperty("media_url_https")
    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    /**
     * 
     * @param mediaUrlHttps
     *     The media_url_https
     */
    @JsonProperty("media_url_https")
    public void setMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The displayUrl
     */
    @JsonProperty("display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * 
     * @param displayUrl
     *     The display_url
     */
    @JsonProperty("display_url")
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    /**
     * 
     * @return
     *     The expandedUrl
     */
    @JsonProperty("expanded_url")
    public String getExpandedUrl() {
        return expandedUrl;
    }

    /**
     * 
     * @param expandedUrl
     *     The expanded_url
     */
    @JsonProperty("expanded_url")
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    @JsonProperty("sizes")
    public Sizes getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    @JsonProperty("sizes")
    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(idStr).append(indices).append(mediaUrl).append(mediaUrlHttps).append(url).append(displayUrl).append(expandedUrl).append(type).append(sizes).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Medium) == false) {
            return false;
        }
        Medium rhs = ((Medium) other);
        return new EqualsBuilder().append(id, rhs.id).append(idStr, rhs.idStr).append(indices, rhs.indices).append(mediaUrl, rhs.mediaUrl).append(mediaUrlHttps, rhs.mediaUrlHttps).append(url, rhs.url).append(displayUrl, rhs.displayUrl).append(expandedUrl, rhs.expandedUrl).append(type, rhs.type).append(sizes, rhs.sizes).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
