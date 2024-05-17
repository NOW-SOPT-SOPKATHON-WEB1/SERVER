package org.sopt.sopkathonweb1.exception;

import org.sopt.sopkathonweb1.common.dto.ErrorMessage;

public class BusinessException extends RuntimeException {
    private ErrorMessage errorMessage;
    public BusinessException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }
}
