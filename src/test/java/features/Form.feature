Feature: Practice Form

#@RegressionTest

@WebTest
Scenario: Verifyng all the mandatory fields of Form with valid data
Given User is on Practice Form page
When User sign up with following details
|FirstName|LastName|Gender|Mobile    |
|Jhon     |Smith   |Male  |1234567891|
And cliks on Submit
Then Form successfully submitted

