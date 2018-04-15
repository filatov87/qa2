Feature: Test created for checking if reservation is made (via API)

  Scenario: Checking API response
    When we are requesting confirmation
    Then Name should be AF_name
    And Surname should be AF_lastname
    And From should be VVO
    And To should be RIX
    And Baggage should be 2
    And Discount code should be 1234567
    And Number of children is 0
    And Number of adults should be 1
    And Seat number is 1
