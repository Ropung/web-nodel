package com.novel.member.application.service;

import com.novel.member.application.repository.MemberRepository;
import com.novel.member.application.usecase.MemberSaveUseCase;
import com.novel.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberSaveUseCase {
    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }
}
