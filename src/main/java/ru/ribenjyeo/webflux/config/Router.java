package ru.ribenjyeo.webflux.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;
import ru.ribenjyeo.webflux.handlers.Handler;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> route (Handler handler) {
        RequestPredicate router = RequestPredicates
                .GET ("/hello")
                .and (RequestPredicates.accept (MediaType.TEXT_PLAIN));

        return RouterFunctions
                .route (router, handler::hello)
                .andRoute (RequestPredicates.GET ("/"), handler::index);
    }
}
