package com.jkb.base.framework.controller;

import com.jkb.base.framework.model.ApiException;
import com.jkb.base.framework.model.ApiRequest;
import com.jkb.base.framework.model.ApiResponse;
import com.jkb.base.framework.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController<T, R> {
    private final ApiService<T, R> apiService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @PostMapping("/api/request")
    public ApiResponse<R> handleApiRequest(@RequestBody ApiRequest<T> apiRequest) {
        try {
            ApiResponse<R> response = apiService.handleApiRequest(apiRequest);
            return response;
        } catch (Exception e) {
            ApiException exception = new ApiException();
            exception.setCode("ERROR");
            exception.setMessage("Internal Server Error");
            exception.setDetails(e.getMessage());
            exception.setRequestId(apiRequest.getRequestId());
            exception.setEndpoint(apiRequest.getEndpoint());
            exception.setStatusCode("500");
            return ApiResponse.of(exception);
        }
    }
}