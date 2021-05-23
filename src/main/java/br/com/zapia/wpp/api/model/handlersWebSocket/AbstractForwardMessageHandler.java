package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.ForwardMessagesRequest;

@HandlerWebSocketEvent(event = EventWebSocket.ForwardMessage)
public abstract class AbstractForwardMessageHandler implements IHandlerWebSocket<ForwardMessagesRequest> {

    @Override
    public Class<ForwardMessagesRequest> getClassType() {
        return ForwardMessagesRequest.class;
    }
}
