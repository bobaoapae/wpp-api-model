package br.com.zapia.wpp.api.model.handlersWebSocket;

@HandlerWebSocketEvent(event = EventWebSocket.LoadEarly)
public abstract class AbstractLoadEarlyHandler implements IHandlerWebSocket<String> {

    @Override
    public Class<String> getClassType() {
        return String.class;
    }
}
