package org.sopt.sopkathonweb1.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "요청하신 사용자가 존재하지 않습니다."),
    ROOM_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "입력하신 방 코드와 일치하는 방이 존재하지 않습니다.")
    ;
    private final int status;

    private final String message;
}
