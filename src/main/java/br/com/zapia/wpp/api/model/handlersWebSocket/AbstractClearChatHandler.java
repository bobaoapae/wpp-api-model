package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.ClearChatRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.ClearChat)
public abstract class AbstractClearChatHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, ClearChatRequest> {

    @Override
    public Class<ClearChatRequest> getClassType() {
        return ClearChatRequest.class;
    }
}
