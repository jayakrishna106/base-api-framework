package com.jkb.base.framework.exception;

import com.jkb.base.framework.model.ApiException;
import com.jkb.base.framework.model.ApiResponse;
import com.jkb.base.framework.model.BaseException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

// ExceptionHandler.java
@Component
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResponse<BaseException> handleException(Exception e) {
        ApiException exception = new ApiException();
        exception.setCode("ERROR");
        exception.setMessage("Internal Server Error");
        exception.setDetails(e.getMessage());
        return ApiResponse.of(exception);
    }
}