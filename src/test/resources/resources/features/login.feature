Feature:  log in

  @Wip
  Scenario: log In test
    Given user is on the base page
    When user clicks on sign in link
    Then user is on the log in page
    And type the email
    And type the password
    And click on sign In button
    Then user is logged in