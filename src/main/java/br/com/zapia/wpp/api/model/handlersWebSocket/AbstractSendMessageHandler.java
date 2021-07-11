package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.SendMessageRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.SendMessage)
public abstract class AbstractSendMessageHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, SendMessageRequest> {

    @Override
    public Class<SendMessageRequest> getClassType() {
        return SendMessageRequest.class;
    }
}
