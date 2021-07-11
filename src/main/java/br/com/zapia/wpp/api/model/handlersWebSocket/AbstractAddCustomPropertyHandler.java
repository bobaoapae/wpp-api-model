package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.AddCustomPropertyRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.AddCustomProperty)
public abstract class AbstractAddCustomPropertyHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, AddCustomPropertyRequest> {

    @Override
    public Class<AddCustomPropertyRequest> getClassType() {
        return AddCustomPropertyRequest.class;
    }
}
