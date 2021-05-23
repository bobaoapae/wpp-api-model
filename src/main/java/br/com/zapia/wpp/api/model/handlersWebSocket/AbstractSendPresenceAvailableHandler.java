package br.com.zapia.wpp.api.model.handlersWebSocket;

@HandlerWebSocketEvent(event = EventWebSocket.SendPresenceAvailable)
public abstract class AbstractSendPresenceAvailableHandler implements IHandlerWebSocket<Void> {

    @Override
    public Class<Void> getClassType() {
        return Void.class;
    }
}
