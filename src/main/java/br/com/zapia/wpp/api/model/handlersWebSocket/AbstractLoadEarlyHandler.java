package br.com.zapia.wpp.api.model.handlersWebSocket;


public abstract class AbstractLoadEarlyHandler implements IHandlerWebSocket<String> {

    @Override
    public Class<String> getClassType() {
        return String.class;
    }
}
