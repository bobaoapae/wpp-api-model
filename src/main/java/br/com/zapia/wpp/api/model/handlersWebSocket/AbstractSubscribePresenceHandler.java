package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.SubscribePresence)
public abstract class AbstractSubscribePresenceHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, String> {

    @Override
    public Class<String> getClassType() {
        return String.class;
    }
}
