package br.com.zapia.wpp.api.model.handlersWebSocket;


import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HandlerWebSocketEvent {
    EventWebSocket event();

    boolean needLogged() default true;
}
