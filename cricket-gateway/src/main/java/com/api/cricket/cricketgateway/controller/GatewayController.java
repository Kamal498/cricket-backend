package com.api.cricket.cricketgateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/defaultFallback")
    public ResponseEntity<String> defaultMessage(){
        return new ResponseEntity<>
                ("There was some error in connecting.Please try again later."
                        , HttpStatus.GATEWAY_TIMEOUT);
    }

}
