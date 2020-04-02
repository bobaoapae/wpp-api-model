package br.com.zapia.wpp.api.model.handlersWebSocket;

import br.com.zapia.wpp.api.model.payloads.ClearChatRequest;

public abstract class AbstractClearChatHandler implements IHandlerWebSocket<ClearChatRequest> {

    @Override
    public Class<ClearChatRequest> getClassType() {
        return ClearChatRequest.class;
    }
}
