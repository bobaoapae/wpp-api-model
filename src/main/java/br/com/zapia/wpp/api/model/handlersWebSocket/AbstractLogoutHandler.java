package br.com.zapia.wpp.api.model.handlersWebSocket;

@HandlerWebSocketEvent(event = EventWebSocket.Logout, needLogged = false)
public abstract class AbstractLogoutHandler implements IHandlerWebSocket<Void> {

    @Override
    public Class<Void> getClassType() {
        return Void.class;
    }
}
