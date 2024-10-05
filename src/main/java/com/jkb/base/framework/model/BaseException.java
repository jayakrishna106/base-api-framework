package com.jkb.base.framework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseException {
    private String code;
    private String message;
    private String details;
}

