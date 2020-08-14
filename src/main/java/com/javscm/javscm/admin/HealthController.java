package com.javscm.javscm.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Health controller.
 *
 * @author liuzhaoming
 */
@RestController
public class HealthController {
    /**
     * Check health string.
     *
     * @return the string
     */
    @GetMapping("/health/check/")
    public String checkHealth() throws InterruptedException {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}