package org.sopt.sopkathonweb1.exception;

import org.sopt.sopkathonweb1.common.dto.ErrorMessage;

public class ForbiddenException extends BusinessException{
    public ForbiddenException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
