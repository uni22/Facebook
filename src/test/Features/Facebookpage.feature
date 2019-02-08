Feature: login page of facebook
  Scenario: test login page elements
    Given I am Facebook chrome user
    When I access facebook url
    Then I see facebook login page
  # this is my new change to check develop branch

#    Scenario: forgotten password link and navigate back
#      Given I am chrome user
#      When I access facebook url
#      Then I click on the forgotenpassword
#      And I go back to homepage
