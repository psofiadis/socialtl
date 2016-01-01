
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
    "w",
    "h",
    "resize"
})
public class Small {

    @JsonProperty("w")
    private Integer w;
    @JsonProperty("h")
    private Integer h;
    @JsonProperty("resize")
    private String resize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Small() {
    }

    /**
     * 
     * @param w
     * @param resize
     * @param h
     */
    public Small(Integer w, Integer h, String resize) {
        this.w = w;
        this.h = h;
        this.resize = resize;
    }

    /**
     * 
     * @return
     *     The w
     */
    @JsonProperty("w")
    public Integer getW() {
        return w;
    }

    /**
     * 
     * @param w
     *     The w
     */
    @JsonProperty("w")
    public void setW(Integer w) {
        this.w = w;
    }

    /**
     * 
     * @return
     *     The h
     */
    @JsonProperty("h")
    public Integer getH() {
        return h;
    }

    /**
     * 
     * @param h
     *     The h
     */
    @JsonProperty("h")
    public void setH(Integer h) {
        this.h = h;
    }

    /**
     * 
     * @return
     *     The resize
     */
    @JsonProperty("resize")
    public String getResize() {
        return resize;
    }

    /**
     * 
     * @param resize
     *     The resize
     */
    @JsonProperty("resize")
    public void setResize(String resize) {
        this.resize = resize;
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
        return new HashCodeBuilder().append(w).append(h).append(resize).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Small) == false) {
            return false;
        }
        Small rhs = ((Small) other);
        return new EqualsBuilder().append(w, rhs.w).append(h, rhs.h).append(resize, rhs.resize).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
