package com.jkb.base.framework.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResponse<T> extends BaseResponse {
    private T payload;
    private BaseException exception;

    public static <T> ApiResponse<T> of(T payload) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setPayload(payload);
        return response;
    }

    public static <T> ApiResponse<T> of(BaseException exception) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setException(exception);
        return response;
    }

    public static <T> ApiResponse<T> of(BaseException exception, T payload) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setException(exception);
        response.setPayload(payload);
        return response;
    }
}