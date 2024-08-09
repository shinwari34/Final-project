Feature: This feature is to validate the page title and create primary account button.

  Scenario: Validate top left corner logo
    Given open browser and navigate to Tek App
    Then validate top left corner is Tek Insurance App
    Then close the browser