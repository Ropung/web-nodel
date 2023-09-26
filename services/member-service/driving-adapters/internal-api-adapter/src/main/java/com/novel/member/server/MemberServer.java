package com.novel.member.server;

import com.novel.member.service.MemberSaveService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberServer implements ApplicationRunner {
    private static final int PORT = 8081;
    private final MemberSaveService memberSaveService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Server server = ServerBuilder
                .forPort(PORT)
                .addService(memberSaveService)
                .build();
        server.start();
        server.awaitTermination();
    }
}
