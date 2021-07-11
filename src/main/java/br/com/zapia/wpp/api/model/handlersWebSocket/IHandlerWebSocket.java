package br.com.zapia.wpp.api.model.handlersWebSocket;


import br.com.zapia.wpp.api.model.payloads.WebSocketRequest;
import br.com.zapia.wpp.api.model.payloads.WebSocketResponse;

import java.util.concurrent.CompletableFuture;

public interface IHandlerWebSocket<K extends WebSocketRequest, T> {

    Class<T> getClassType();

    CompletableFuture<WebSocketResponse> handle(K webSocketRequest, T payload) throws Exception;
}
