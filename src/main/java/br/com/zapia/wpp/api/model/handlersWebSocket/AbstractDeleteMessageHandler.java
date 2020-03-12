package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.DeleteMessageRequest;

public abstract class AbstractDeleteMessageHandler implements IHandlerWebSocket<DeleteMessageRequest> {

    @Override
    public Class<DeleteMessageRequest> getClassType() {
        return DeleteMessageRequest.class;
    }
}
