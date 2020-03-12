package br.com.zapia.wpp.api.model.handlersWebSocket;


public abstract class AbstractDownloadMediaHandler implements IHandlerWebSocket<String> {

    @Override
    public Class<String> getClassType() {
        return String.class;
    }
}
