package com.novel.bff.member.service;

import com.novel.bff.member.dto.MemberSaveDto.MemberSaveRequestDto;
import com.novel.bff.member.dto.MemberSaveDto.MemberSaveResponseDto;

public interface MemberClient {
    MemberSaveResponseDto save(MemberSaveRequestDto requestDto);
}
