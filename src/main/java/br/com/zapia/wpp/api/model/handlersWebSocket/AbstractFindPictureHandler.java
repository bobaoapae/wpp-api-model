package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.FindPictureRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;

@HandlerWebSocketEvent(event = EventWebSocket.FindPicture)
public abstract class AbstractFindPictureHandler<K extends WebSocketRequest> implements IHandlerWebSocket<K, FindPictureRequest> {

    @Override
    public Class<FindPictureRequest> getClassType() {
        return FindPictureRequest.class;
    }
}
