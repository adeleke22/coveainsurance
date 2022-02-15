Feature: Application form Test

  Background: 
    Given I am on the Homepage
    And I click on My quote page Link
    Given The user is on the quote page

  Scenario: Select title MR from dropdown
    When the dropdown is selected
    Then user can select the title MR

  @login
  Scenario Outline: A invalid email address is entered
    When an invalid email address "<email>" is entered
    Then an error is displayed

    Examples: 
      | email         |
      | AAA@gmail.com |

  @login
  Scenario Outline: A valid email address is entered
    When a valid email address "<email>" entered
    Then no error is displayed

    Examples: 
      | email          |
      | AAAA@gmail.com |

  @Address
  Scenario Outline: Postcode lookup for valid postcode
    When they complete the Your Details Section and enter a valid postcode "<postcode>" and clicks find address
    Then a list of addresses is shown

    Examples: 
      | postcode |
      | AA11 2AA |

  Scenario: Quote form completed
    When they complete all sections with valid information and click continue
    Then the summary page is displayed
