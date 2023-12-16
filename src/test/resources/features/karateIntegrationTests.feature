# This is the sample feature file for testing the REST APIs using Karate framework

Feature: Karate Integration Tests For REST APIs

  Background: * def endpoint = 'http://localhost:9090/karate/v1/answers'

  Scenario: Test Springboot Rest API Yes or No
    Given url endpoint
    When method get
    Then status 200
    * def answer = response.answer
    And match answer == 'yes' or answer == 'no'
