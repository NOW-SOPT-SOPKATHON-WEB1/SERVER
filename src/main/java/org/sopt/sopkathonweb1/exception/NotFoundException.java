package org.sopt.sopkathonweb1.exception;

import org.sopt.sopkathonweb1.common.dto.ErrorMessage;

public class NotFoundException extends BusinessException {
    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
