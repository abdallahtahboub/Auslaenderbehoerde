# mvn clean verify -Dcucumber.filter.tags=@inquiry -Dbrowser=chrome -DtestedEnv=STAGING 
 
@inquiry @UI
Feature: Status inquiry
   @SendingEmail
   Scenario: Ask for Status
    When I can open the auslaender website 
    And choose a reason for the Inquiry 
    And enter E-Mail address 
    And confirm my E-Mail address
    And click on next
    And enter the file number 
    And choose my nationality 
    And enter family name 
    And enter first name 
    And enter date of birth 
    And enter mobile number
    And enter message 
    And click on Send