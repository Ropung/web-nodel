package com.novel.member.application.repository;

import com.novel.member.domain.Member;

public interface MemberRepository {
    Member save(Member member);
}
