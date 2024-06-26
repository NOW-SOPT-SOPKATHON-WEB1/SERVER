package org.sopt.sopkathonweb1.controller.dto;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseApiResponseNonData {

    //    @Schema(example =  "상태 코드")
    private Integer status;

    //    @Schema(example =  "성공 여부")
    private Boolean success;

    //    @Schema(example =  "상태 메세지")
    private String message;

    public BaseApiResponseNonData(String message){
        this.status = HttpStatus.OK.value();
        this.success = true;
        this.message = message;
    }
}