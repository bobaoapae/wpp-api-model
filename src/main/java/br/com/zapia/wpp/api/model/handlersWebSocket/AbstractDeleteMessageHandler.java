package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.DeleteMessageRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.DeleteMessage)
public abstract class AbstractDeleteMessageHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, DeleteMessageRequest> {

    @Override
    public Class<DeleteMessageRequest> getClassType() {
        return DeleteMessageRequest.class;
    }
}
