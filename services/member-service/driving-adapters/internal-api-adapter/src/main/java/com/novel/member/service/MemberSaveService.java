package com.novel.member.service;

import com.novel.grpc.member.lib.MemberSaveGrpc.MemberSaveImplBase;
import com.novel.grpc.member.lib.MemberSaveRequest;
import com.novel.grpc.member.lib.MemberSaveResponse;
import com.novel.member.application.usecase.MemberSaveUseCase;
import com.novel.member.domain.Member;
import com.novel.member.domain.type.GenderType;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.Instant;
import java.util.Objects;

@GrpcService
@RequiredArgsConstructor
public class MemberSaveService extends MemberSaveImplBase {
    private final MemberSaveUseCase memberSaveUseCase;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void memberSave(MemberSaveRequest request, StreamObserver<MemberSaveResponse> responseObserver) {
        Member member = Member.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .name(request.getName())
                .genderType(
                        Objects.equals(request.getGenderType(), GenderType.M.genderType) ? GenderType.M : GenderType.F
                )
                .nickname(request.getNickname())
                .createdAt(Instant.now())
                .build();
        Member savedMember = memberSaveUseCase.save(member);
        MemberSaveResponse response = MemberSaveResponse.newBuilder()
                .setId(savedMember.id.toString())
                .setUsername(savedMember.username)
                .setGenderType(savedMember.genderType.genderType)
                .setName(savedMember.name)
                .setNickname(savedMember.nickname)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
