package org.sopt.sopkathonweb1.dto.response;

import org.sopt.sopkathonweb1.domain.Member;

public record UserTmiResponse(
    String name,
    String content
) {
    public static UserTmiResponse of(Member member) {
        return new UserTmiResponse(member.getName(), member.getContent());
    }

}
