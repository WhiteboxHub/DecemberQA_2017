#Whitebox feature

Feature: Home Page

@first
Scenario: Check for header links 

Given User is able to view the home page $100
When user clicks on header link
Then user navigates to appropriate page 


@second
Scenario Outline: Test for Header Menu Links

Given User is able to view the home page  
When User clicks on "<Link>"
Then User navigates to "<LinkPage>"

Examples:
|Link      | LinkPage     |
|Schedule  | SchedulePage |
|FAQ       | FAQPage      |
|Demo      | DemoPage     |


@third 
Scenario: Check for Contact Page

Given User goes to Contact Page
When User enters values for sending message
|Name   |Jeeva|
|Email  |Jeeva@gmail.com|
|Phone  |510-678-3455|
|Message|am interested in the course|
#|Jeeva|
#|Jeeva@gmail.com|
#|510-678-3455|
#|am interested in the course|
And User clicks on send button
Then Receive appropriate response





