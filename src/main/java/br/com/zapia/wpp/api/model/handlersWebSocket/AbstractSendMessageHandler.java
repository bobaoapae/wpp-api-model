package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.SendMessageRequest;

public abstract class AbstractSendMessageHandler implements IHandlerWebSocket<SendMessageRequest> {

    @Override
    public Class<SendMessageRequest> getClassType() {
        return SendMessageRequest.class;
    }
}
