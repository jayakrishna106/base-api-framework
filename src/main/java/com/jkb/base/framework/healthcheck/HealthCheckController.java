package com.jkb.base.framework.healthcheck;

import com.jkb.base.framework.model.HealthCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {
    @GetMapping("/api/healthcheck")
    public HealthCheckResponse healthCheck() {
        HealthCheckResponse response = new HealthCheckResponse();
        response.setStatus("UP");
        response.setMessage("Service is running");
        return response;
    }
}

