package com.novel.member.rdb.entity;

import com.novel.member.domain.type.GenderType;
import com.novel.supprt.jpa.UuidBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;

import static com.novel.member.rdb.support.MemberSchemaConstants.SCHEMA;
import static com.novel.member.rdb.support.MemberSchemaConstants.TB_MEMBER;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        schema = SCHEMA,
        catalog = SCHEMA,
        name = TB_MEMBER
)
public class MemberEntity extends UuidBaseEntity {
    public String username;
    public String password;
    public String name;
    @Enumerated(EnumType.STRING)
    public GenderType genderType;
    public String nickname;
    public Instant createdAt;



}
