package org.sopt.sopkathonweb1.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    // message 사용 예시
    // MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 사용자가 존재하지 않습니다."),
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "요청하신 사용자가 존재하지 않습니다.")


    ;
    private final int status;

    private final String message;
}
