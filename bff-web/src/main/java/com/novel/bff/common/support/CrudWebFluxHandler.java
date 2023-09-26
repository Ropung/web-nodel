package com.novel.bff.common.support;

import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.CorePublisher;

public interface CrudWebFluxHandler<T> {
    CorePublisher<T> save(ServerRequest request);
    CorePublisher<T> find(ServerRequest request);
    CorePublisher<T> findAll(ServerRequest request);
    CorePublisher<T> update(ServerRequest request);
    CorePublisher<T> delete(ServerRequest request);
}
