Feature: test

 Scenario Outline: Login Test
    Given User name "<users>" and password "<passwords>"
    When Use button "Login" and response is "Login was succesful"
    Then Use button "Login"
    Examples:
      |users|passwords|
      |andreslo|123|
      |juan|123|
      ||123|

  Scenario Outline: Register Test
    Given User name "<users>" and password "<passwords>"
    When Use button "Login" and response is "Login failes: Review password or username"
    Then Use button "Register"
    Examples:
      |users|passwords|
      |andreslo|123|
      |juan|123|
      ||123|