package com.karate.integrationtests.controller;


import com.karate.integrationtests.model.KarateResponse;
import com.karate.integrationtests.service.KarateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class KarateController {

    private final KarateService service;

    @GetMapping("/answers")
    public ResponseEntity<KarateResponse> fetchAnswer() throws URISyntaxException {
        KarateResponse response = service.fetchAnswer();
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }
}
