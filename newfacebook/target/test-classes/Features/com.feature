Feature: singing up for facebook account

  @Test
  Scenario: would like to sign up for facebook account
    #Given user should navigate to facebook home page
    #Then user should should enter firstname in first name field
    #Then user should enter lastname in lastname field
    #And user should enter email/mobile in email/mobile field
    #And user should enter password in password field
    Given user should navigate to facebook home page
    Then user should should enter "farrukh" in first name field
    Then user should enter "khan" in lastname field
    And user should enter "812771" in email/mobile field
    And user should enter "ajhdgasjsgd" in password field

  Scenario: would like to enter DOB in drop down area
    Given user should enter month in DOB section
    Then user should enter date in DOB section
    And user should enter year in DOB section

  Scenario: would like to select gender
    Given user should select gender from radio gender section

  Scenario: submitting the information
    Given user should click on the signup button
