package com.example.mini.games.common;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BaseClient {

    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
