package com.karate.integrationtests.client;


import com.karate.integrationtests.model.KarateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class KarateClient {

    private final WebClient client;

    @Value("${karate.rest.endpoint:https://yesno.wtf/api}")
    private String restEndpoint;

    public KarateResponse fetchAnswer() throws URISyntaxException {
        KarateResponse response = client.get().uri(new URI(restEndpoint)).retrieve().bodyToMono(KarateResponse.class).block();
        return response;
    }

}
