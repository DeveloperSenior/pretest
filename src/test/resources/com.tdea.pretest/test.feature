Feature: test

  Scenario: Login Test
    Given User name "andreslo" and password "123"
    When Use button "Login" and response is "Login was succesful"
    Then Use button "Login"

  Scenario: Register Test
    Given User name "andreslo" and password "123"
    When Use button "Login" and response is "Login failes: Review password or username"
    Then Use button "Register"