Feature: US1001 user should create a room at kaolapalace page
  Scenario: TC05 testing room creation at the page
    Given user is on the Koalapalace page
    And user clicks on the first log in button
    When user enter username
    When user enter password
    And user clicks on log in button
    And user clicks on Hotel Management button
    And user clicks on Hotel Rooms
    And user clicks on Add Hotel Room button
    When user select hotel on the page
    When user enter code
    When user enter name
    When user enter location
    When user enter description
    When user enter price
    When user enter room type
    When user enter max Adult count
    When user enter max Children count
    And user click approved button
    And user clicks save button
    Then verify the message

