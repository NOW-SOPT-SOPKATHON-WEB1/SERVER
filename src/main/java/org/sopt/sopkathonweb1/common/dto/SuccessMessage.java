package org.sopt.sopkathonweb1.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum SuccessMessage {

    // Success message 예시
    FIND_TMI_SUCCESS(HttpStatus.CREATED.value(),"TMI를 찾는데 성공하였습니다."),
   ;
    private final int status;
    private final String message;
}
