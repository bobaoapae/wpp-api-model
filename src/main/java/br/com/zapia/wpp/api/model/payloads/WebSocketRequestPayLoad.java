package br.com.zapia.wpp.api.model.payloads;

import br.com.zapia.wpp.api.model.handlersWebSocket.EventWebSocket;

public class WebSocketRequestPayLoad {

    private EventWebSocket event;
    private Object payload;

    public EventWebSocket getEvent() {
        return event;
    }

    public void setEvent(EventWebSocket event) {
        this.event = event;
    }

    public <K> K getPayload() {
        return (K) payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
