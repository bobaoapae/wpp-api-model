package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.AddChatMessageListenerRequest;

@HandlerWebSocketEvent(event = EventWebSocket.AddChatMessageListener)
public abstract class AbstractAddChatMessageListenerHandler implements IHandlerWebSocket<AddChatMessageListenerRequest> {

    @Override
    public Class<AddChatMessageListenerRequest> getClassType() {
        return AddChatMessageListenerRequest.class;
    }
}
