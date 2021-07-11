package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.AddChatMessageListenerRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.AddChatMessageListener)
public abstract class AbstractAddChatMessageListenerHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, AddChatMessageListenerRequest> {

    @Override
    public Class<AddChatMessageListenerRequest> getClassType() {
        return AddChatMessageListenerRequest.class;
    }
}
