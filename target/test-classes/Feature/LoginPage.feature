Feature: This is the Login Page Feature

  Scenario Outline: User can able to login the application
    Given user is on login page "<expectedPageTitle>"
    When user enter the login credentials "<username>","<password>"
    Then validate the login page "<usernameintheheader>"

    Examples: 
      | expectedPageTitle                        | username    | password                |          | usernameintheheader |
      | Conversation starters - Icebreaker Games | TableTopics | pari@riverstonetech.com | pari@123 | WELCOME, PARI J!    |
