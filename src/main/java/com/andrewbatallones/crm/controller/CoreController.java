package com.andrewbatallones.crm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController adds @Controller and @ResponseBody
@RestController
public class CoreController {

    @GetMapping("/healthcheck")
    public Map<String, String> healthcheck() {
        Map<String, String> response = new HashMap<>();

        response.put("status", "ok");

        return response;
    }
}
