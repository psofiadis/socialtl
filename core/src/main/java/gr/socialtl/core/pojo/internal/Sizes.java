
package gr.socialtl.core.pojo.internal;

import java.util.HashMap;
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
    "medium",
    "small",
    "thumb",
    "large"
})
public class Sizes {

    @JsonProperty("medium")
    private Medium_ medium;
    @JsonProperty("small")
    private Small small;
    @JsonProperty("thumb")
    private Thumb thumb;
    @JsonProperty("large")
    private Large large;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes() {
    }

    /**
     * 
     * @param thumb
     * @param small
     * @param large
     * @param medium
     */
    public Sizes(Medium_ medium, Small small, Thumb thumb, Large large) {
        this.medium = medium;
        this.small = small;
        this.thumb = thumb;
        this.large = large;
    }

    /**
     * 
     * @return
     *     The medium
     */
    @JsonProperty("medium")
    public Medium_ getMedium() {
        return medium;
    }

    /**
     * 
     * @param medium
     *     The medium
     */
    @JsonProperty("medium")
    public void setMedium(Medium_ medium) {
        this.medium = medium;
    }

    /**
     * 
     * @return
     *     The small
     */
    @JsonProperty("small")
    public Small getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The small
     */
    @JsonProperty("small")
    public void setSmall(Small small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The thumb
     */
    @JsonProperty("thumb")
    public Thumb getThumb() {
        return thumb;
    }

    /**
     * 
     * @param thumb
     *     The thumb
     */
    @JsonProperty("thumb")
    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    /**
     * 
     * @return
     *     The large
     */
    @JsonProperty("large")
    public Large getLarge() {
        return large;
    }

    /**
     * 
     * @param large
     *     The large
     */
    @JsonProperty("large")
    public void setLarge(Large large) {
        this.large = large;
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
        return new HashCodeBuilder().append(medium).append(small).append(thumb).append(large).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes) == false) {
            return false;
        }
        Sizes rhs = ((Sizes) other);
        return new EqualsBuilder().append(medium, rhs.medium).append(small, rhs.small).append(thumb, rhs.thumb).append(large, rhs.large).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
