package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.AddCustomPropertyRequest;

public abstract class AbstractAddCustomPropertyHandler implements IHandlerWebSocket<AddCustomPropertyRequest> {

    @Override
    public Class<AddCustomPropertyRequest> getClassType() {
        return AddCustomPropertyRequest.class;
    }
}
