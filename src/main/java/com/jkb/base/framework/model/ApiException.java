package com.jkb.base.framework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiException extends BaseException {
    private String requestId;
    private String endpoint;
    private String statusCode;
}