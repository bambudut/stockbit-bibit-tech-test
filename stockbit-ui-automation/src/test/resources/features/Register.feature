Feature: Sign up an account to Stockbit

  @failed-register
  Scenario Outline: User register with all failed cases
    Given user click CTA register
    When user choose register with email
    And user input name "<name>", email "<email>", username "<username>", password "<password>" and confirm password "<confirm_password>"
    And user click register button
    Then user should be seen error message
    Examples:
      | name      | email                   | username      | password    | confirm_password |
      | Rifky     | klontongapp@gmail.com   | hidegrumpy55  | Password22  | Password22       |
      | Wahyu     | mau.daftar@gmail        | hidegrumpy55  | Password22  | Password22       |
      | Pratama   | ingin.daftar@gmail.com  | prifkywahyu   | Password22  | Password22       |
      | Bi-10!@$  | ingin.daftar@gmail.com  | hidegrumpy55  | Password22  | Password22       |
      | Stockbit  | ingin.daftar@gmail.com  | hidegrumpy55  | Password22  | Password89       |