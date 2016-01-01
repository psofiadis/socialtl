
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
    "screen_name",
    "name",
    "id",
    "id_str",
    "indices"
})
public class UserMention {

    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("indices")
    private List<Integer> indices = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserMention() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param screenName
     * @param indices
     * @param idStr
     */
    public UserMention(String screenName, String name, BigInteger id, String idStr, List<Integer> indices) {
        this.screenName = screenName;
        this.name = name;
        this.id = id;
        this.idStr = idStr;
        this.indices = indices;
    }

    /**
     * 
     * @return
     *     The screenName
     */
    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    /**
     * 
     * @param screenName
     *     The screen_name
     */
    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
        return new HashCodeBuilder().append(screenName).append(name).append(id).append(idStr).append(indices).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserMention) == false) {
            return false;
        }
        UserMention rhs = ((UserMention) other);
        return new EqualsBuilder().append(screenName, rhs.screenName).append(name, rhs.name).append(id, rhs.id).append(idStr, rhs.idStr).append(indices, rhs.indices).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
