package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.FindPictureRequest;

public abstract class AbstractFindPictureHandler implements IHandlerWebSocket<FindPictureRequest> {

    @Override
    public Class<FindPictureRequest> getClassType() {
        return FindPictureRequest.class;
    }
}
