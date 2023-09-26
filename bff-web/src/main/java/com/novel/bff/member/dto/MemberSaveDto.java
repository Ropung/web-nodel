package com.novel.bff.member.dto;

import lombok.Builder;

public record MemberSaveDto() {
    @Builder
    public record MemberSaveRequestDto(
            String username,
            String password,
            String name,
            String genderType,
            String nickname
    ) {}

    @Builder
    public record MemberSaveResponseDto(
            String id,
            String username,
            String name,
            String genderType,
            String nickname
    ) {}
}
