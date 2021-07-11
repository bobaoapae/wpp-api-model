package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.ForwardMessagesRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.ForwardMessage)
public abstract class AbstractForwardMessageHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, ForwardMessagesRequest> {

    @Override
    public Class<ForwardMessagesRequest> getClassType() {
        return ForwardMessagesRequest.class;
    }
}
