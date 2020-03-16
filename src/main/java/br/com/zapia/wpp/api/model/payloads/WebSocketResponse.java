package br.com.zapia.wpp.api.model.payloads;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = WebSocketResponseFrame.class, name = "WebSocketResponseFrame")}
)
public class WebSocketResponse {

    private int status;
    private Object response;

    public WebSocketResponse() {
    }

    public WebSocketResponse(int status) {
        this(status, null);
    }


    public WebSocketResponse(int status, Object response) {
        this.status = status;
        this.response = response;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
