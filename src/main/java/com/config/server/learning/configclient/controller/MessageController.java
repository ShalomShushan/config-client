package com.config.server.learning.configclient.controller;

import com.config.server.learning.configclient.config.ApplicationConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MessageController {
    private ApplicationConfiguration applicationConfiguration;

    public MessageController(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }


    @GetMapping("/get-config")
    public Map<String, String> welcome() {
        Map<String, String> map = new HashMap<>();
        map.put("message", applicationConfiguration.getMessage());
        map.put("name", applicationConfiguration.getName());
        return map;
    }

}
