package gr.socialtl.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Panagiotis on 12/29/2015.
 */
public class StatusDTOImpl {
    @JsonProperty("statusId")
    private String statusId;
    @JsonProperty("statusMessage")
    private String statusMessage;

    public StatusDTOImpl() {
    }

    public StatusDTOImpl(String statusId, String statusMessage) {
        this.statusId = statusId;
        this.statusMessage = statusMessage;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
