package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.GetAllContacts)
public abstract class AbstractGetAllContactsHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, Void> {

    @Override
    public Class<Void> getClassType() {
        return Void.class;
    }
}
