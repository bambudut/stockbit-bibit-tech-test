@login
Feature: Login to Stockbit website

  Scenario Outline: User login with different cases
    Given user click CTA login
    When user input email "<email>" and password "<password>"
    And user click login button
    Then user check the login status "<status>"
    Examples:
      | email                   | password    | status |
      | klontongapp@gmail.com   | sajED301!ms | true   |
      | klontongapp@gmail.com   | salahni84#  | false  |
      | belum.daftar@gmail.com  | validPass!@ | false  |