package br.com.zapia.wpp.api.model.handlersWebSocket;


public abstract class AbstractSendPresenceUnavailableHandler implements IHandlerWebSocket<Void> {

    @Override
    public Class<Void> getClassType() {
        return Void.class;
    }
}
