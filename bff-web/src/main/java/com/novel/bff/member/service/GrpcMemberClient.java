package com.novel.bff.member.service;

import com.novel.bff.member.dto.MemberSaveDto.MemberSaveRequestDto;
import com.novel.bff.member.dto.MemberSaveDto.MemberSaveResponseDto;
import com.novel.grpc.member.lib.MemberSaveGrpc.MemberSaveBlockingStub;
import com.novel.grpc.member.lib.MemberSaveRequest;
import com.novel.grpc.member.lib.MemberSaveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GrpcMemberClient implements MemberClient {
    private final MemberSaveBlockingStub memberSaveBlockingStub;

    @Override
    public MemberSaveResponseDto save(MemberSaveRequestDto requestDto) {
        MemberSaveResponse response = memberSaveBlockingStub.memberSave(
                MemberSaveRequest.newBuilder()
                        .setUsername(requestDto.username())
                        .setPassword(requestDto.password())
                        .setGenderType(requestDto.genderType())
                        .setName(requestDto.name())
                        .setNickname(requestDto.nickname())
                        .build()
        );
        return toMemberResponseDto(response);
    }

    private MemberSaveResponseDto toMemberResponseDto(MemberSaveResponse res) {
        return MemberSaveResponseDto.builder()
                .id(res.getId())
                .username(res.getUsername())
                .genderType(res.getGenderType())
                .name(res.getName())
                .nickname(res.getNickname())
                .build();

    }
}
