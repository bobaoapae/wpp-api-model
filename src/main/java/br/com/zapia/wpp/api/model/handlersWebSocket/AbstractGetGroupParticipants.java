package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.GetGroupParticipants)
public abstract class AbstractGetGroupParticipants<K extends WebSocketRequest> implements IHandlerWebSocket<K, String> {
    @Override
    public Class<String> getClassType() {
        return String.class;
    }

}
