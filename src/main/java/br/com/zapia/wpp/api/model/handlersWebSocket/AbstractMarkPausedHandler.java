package br.com.zapia.wpp.api.model.handlersWebSocket;

@HandlerWebSocketEvent(event = EventWebSocket.MarkPaused)
public abstract class AbstractMarkPausedHandler implements IHandlerWebSocket<String> {

    @Override
    public Class<String> getClassType() {
        return String.class;
    }
}
