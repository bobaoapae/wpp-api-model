package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.Pong, needLogged = false)
public abstract class AbstractPongHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, Void> {

    @Override
    public Class<Void> getClassType() {
        return Void.class;
    }
}
