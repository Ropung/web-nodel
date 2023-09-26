package com.novel.bff.member.router;

import com.novel.bff.member.handler.MemberHandlerV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
@RequiredArgsConstructor
public class MemberRouter {
    private final MemberHandlerV1 memberHandlerV1;

    @Bean("memberV1")
    RouterFunction<ServerResponse> memberV1() {
        return nest(
                path("/v1/member"),
                route()
                        .POST("", memberHandlerV1::save)
                        .GET("{memberId}", memberHandlerV1::find)
                        .build()
        );
    }
}
