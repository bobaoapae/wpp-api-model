package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.FindPictureRequest;

@HandlerWebSocketEvent(event = EventWebSocket.FindPicture)
public abstract class AbstractFindPictureHandler implements IHandlerWebSocket<FindPictureRequest> {

    @Override
    public Class<FindPictureRequest> getClassType() {
        return FindPictureRequest.class;
    }
}
