package com.novel.bff.common.config;

import com.novel.grpc.member.lib.MemberSaveGrpc;
import com.novel.grpc.member.lib.MemberSaveGrpc.MemberSaveBlockingStub;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcStubConfig {
    @Bean
    public MemberSaveBlockingStub memberSaveBlockingStub() {
        return MemberSaveGrpc.newBlockingStub(
                ManagedChannelBuilder
                        .forAddress("localhost", 8081)
                        .usePlaintext()
                        .build()
        );
    }
}
