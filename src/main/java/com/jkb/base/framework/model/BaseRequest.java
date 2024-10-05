package com.jkb.base.framework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseRequest {
    private String requestId;
    private String requestTime;

}