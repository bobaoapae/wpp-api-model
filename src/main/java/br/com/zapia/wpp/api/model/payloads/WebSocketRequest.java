package br.com.zapia.wpp.api.model.payloads;


public class WebSocketRequest {

    private String tag;
    private WebSocketRequestPayLoad webSocketRequestPayLoad;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public WebSocketRequestPayLoad getWebSocketRequestPayLoad() {
        return webSocketRequestPayLoad;
    }

    public void setWebSocketRequestPayLoad(WebSocketRequestPayLoad webSocketRequestPayLoad) {
        this.webSocketRequestPayLoad = webSocketRequestPayLoad;
    }

}
