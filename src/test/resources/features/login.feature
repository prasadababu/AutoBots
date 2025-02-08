Feature: User login to practicetestautomation
  I want to validate if user is able to login without any issues

  @Maintag
  Scenario Outline: 1 Login test
    Given user launches practicetestautomation website
    And user enters "<Username>" as username
    And user enters "<Password>" as password
    And user clicks Login button
    Then login is successful

    Examples:
      | Username | Password    |
      | test     | password    |
      | pretty   | password    |
      | frank    | password    |
      | student  | Password123 |

  @tag1
  Scenario: 2 Login test
    Given user launches practicetestautomation website
    And user enters User Name
    And user enters password
    And user clicks Login button
    Then login is successful
    And user clicks Logout button
    Then logout is successful

  @tag2
  Scenario: 3 Login test
    Given user launches practicetestautomation website
    And user enters User Name
    And user enters password
    And user clicks Login button
    Then login is successful

  @tag3
  Scenario: 4 Login test
    Given user launches practicetestautomation website
    And user enters User Name
    And user enters password
    And user clicks Login button
    Then login is successful
