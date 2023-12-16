package com.karate.integrationtests.service;

import com.karate.integrationtests.client.KarateClient;
import com.karate.integrationtests.model.KarateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;


@Service
@RequiredArgsConstructor
public class KarateServiceImpl implements  KarateService{

    private final KarateClient client;

    @Override
    public KarateResponse fetchAnswer() throws URISyntaxException {
        return client.fetchAnswer();
    }
}
