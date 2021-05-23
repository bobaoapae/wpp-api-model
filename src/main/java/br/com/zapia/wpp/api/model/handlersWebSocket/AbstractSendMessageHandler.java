package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.SendMessageRequest;

@HandlerWebSocketEvent(event = EventWebSocket.SendMessage)
public abstract class AbstractSendMessageHandler implements IHandlerWebSocket<SendMessageRequest> {

    @Override
    public Class<SendMessageRequest> getClassType() {
        return SendMessageRequest.class;
    }
}
