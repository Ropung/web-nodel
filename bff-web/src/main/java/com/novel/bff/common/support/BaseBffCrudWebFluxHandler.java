package com.novel.bff.common.support;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface BaseBffCrudWebFluxHandler extends CrudWebFluxHandler<ServerResponse> {
    Mono<ServerResponse> save(ServerRequest request);
    Mono<ServerResponse> find(ServerRequest request);
    Mono<ServerResponse> findAll(ServerRequest request);
    Mono<ServerResponse> update(ServerRequest request);
    Mono<ServerResponse> delete(ServerRequest request);
}
