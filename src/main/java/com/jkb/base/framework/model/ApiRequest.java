package com.jkb.base.framework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiRequest<T> extends BaseRequest {
    private String endpoint;
    private T payload;
}