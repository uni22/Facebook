Feature: Santander windows opening
  Scenario: Santander opening the windows
    Given I am Santander chrome user
    When I access santander
    Then I see Multiple windows
