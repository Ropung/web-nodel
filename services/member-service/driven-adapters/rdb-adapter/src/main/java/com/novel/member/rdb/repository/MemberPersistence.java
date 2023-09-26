package com.novel.member.rdb.repository;

import com.novel.member.application.repository.MemberRepository;
import com.novel.member.domain.Member;
import com.novel.member.rdb.entity.MemberEntity;
import com.novel.member.rdb.mapper.MemberEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberPersistence implements MemberRepository {
    private final MemberEntityMapper mapper;
    private final MemberJpaRepository repository;

    @Override
    public Member save(Member member) {
        MemberEntity memberEntity = mapper.toEntity(member);
        return mapper.toDomain(
                repository.save(memberEntity)
        );
    }
}
