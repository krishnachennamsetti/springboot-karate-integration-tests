package com.karate.integrationtests.service;

import com.karate.integrationtests.model.KarateResponse;

import java.net.URISyntaxException;

public interface KarateService {

    KarateResponse fetchAnswer() throws URISyntaxException;

}
