package com.jkb.base.framework.service;

import com.jkb.base.framework.model.ApiRequest;
import com.jkb.base.framework.model.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ApiServiceImpl.java
@Service
@RequiredArgsConstructor
public class ApiServiceImpl<T, R> implements ApiService<T, R> {
    @Override
    public ApiResponse<R> handleApiRequest(ApiRequest<T> apiRequest) {
        // Handle the API request and create a response
        ApiResponse<R> response = new ApiResponse<>();
        response.setResponseId("123");
        response.setResponseTime(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
        response.setResponseStatus("SUCCESS");
        // Set the response payload
        response.setPayload((R) new Object());
        return response;
    }
}
