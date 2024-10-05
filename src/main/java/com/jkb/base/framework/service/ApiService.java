package com.jkb.base.framework.service;

import com.jkb.base.framework.model.ApiRequest;
import com.jkb.base.framework.model.ApiResponse;

public interface ApiService<T, R> {
    ApiResponse<R> handleApiRequest(ApiRequest<T> apiRequest);
}

