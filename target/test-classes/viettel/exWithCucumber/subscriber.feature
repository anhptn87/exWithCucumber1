Feature: subscriber function

  
  Scenario Outline: Enter wrong email
    Given I am on the home page
    When I enter invalid email '<email>'
    And I click on Dang ky button
    Then I see error message "* Email không đúng định dạng"

    Examples: 
      | email |
      | anh   |
      | anh@a |
      |       |

  Scenario: Initial extra form
    Given I am on the home page
    When I enter a valid email to subscriber
    Then The form is initial correctly

  Scenario Outline: Invalid full name in extra form
    Given I am on the extra form
    When I enter '<fullname>' into the full name field
    Then Error message on Full name appears "This is required field"

    Examples: 
      | fullname |
      |          |
      | 335      |
@runnow
  Scenario: Does not chooes gender on the extra form
    Given I am on the extra form
    When I fill valid information to all field exept Gender field
    Then Error message on Gender field appears
