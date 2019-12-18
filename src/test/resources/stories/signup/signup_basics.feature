Feature: this story covers signup empty fields error
  Scenario: get empty fields error
    Given User open page
    When User login with empty credentials
    Then User should see error
