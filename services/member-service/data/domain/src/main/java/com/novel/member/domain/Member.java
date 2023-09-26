package com.novel.member.domain;

import com.novel.member.domain.type.GenderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    public UUID id;
    public String username;
    public String password;
    public String name;
    public GenderType genderType;
    public String nickname;
    public Instant createdAt;
}
