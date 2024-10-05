package com.jkb.base.framework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseResponse {
    private String responseId;
    private String responseTime;
    private String responseStatus;
}