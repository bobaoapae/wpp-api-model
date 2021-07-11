package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.GetGroupInviteInfo, needLogged = false)
public abstract class AbstractGetGroupInviteInfoHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, String> {

    @Override
    public Class<String> getClassType() {
        return String.class;
    }
}
