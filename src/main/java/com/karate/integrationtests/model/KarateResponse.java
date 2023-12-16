package com.karate.integrationtests.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KarateResponse {

    private String answer;
    private boolean forced;
    private String image;
}
