package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.ForwardMessagesRequest;

public abstract class AbstractForwardMessageHandler implements IHandlerWebSocket<ForwardMessagesRequest> {

    @Override
    public Class<ForwardMessagesRequest> getClassType() {
        return ForwardMessagesRequest.class;
    }
}
