Feature: Application Login

Scenario: Admin Page default login

Given User is on NetBanking landing Page
When User login into Application with "admin" and password "1234"
Then Home Page is displayed
And Cards are displayed

#Reusable
Scenario: User Page default login

Given User is on NetBanking landing Page
When User login into Application with "user" and password "0953"
Then Home Page is displayed
And Cards are displayed

@SmokeTest
Scenario Outline: User Page default login

Given User is on NetBanking landing Page
When User login into Application with "<Username>" and password "<Password>" combination
Then Home Page is displayed
And Cards are displayed

Examples:
| Username   | Password |
| debituser  | hello12  |
| credituser | lpo213   |

@SmokeTest
Scenario: User Page default Sign Up

Given User is on Practice landing Page
When User Signup into Application
| rahul             |
| shetty            |   
| contact@email.com |
| 54343646463       |
Then Home Page is displayed
And Cards are displayed