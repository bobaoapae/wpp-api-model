package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.WebSocketResponse;

import java.util.concurrent.CompletableFuture;

public interface IHandlerWebSocket<T> {

    Class<T> getClassType();

    CompletableFuture<WebSocketResponse> handle(T payload) throws Exception;
}
