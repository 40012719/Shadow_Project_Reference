#Author:shandhiya.v.s@ltts.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: I want to test the app
  I want to use this to test the app 
   
  Scenario: Login Functionality
   Given: I want to open the app
   Then: I want to enter the 'sandy@gmail.com'
   And: I want  enter the 'asdf'
    And: I want to click on login button	
 #	Scenario Outline: Login Functionality with Remember me
    #Given I want to open the app
    #Then I want to enter the <emailid>
    #And I want  enter the <password>
    #And I want to remember credentials
    #And I want to click on login button
    #
     #Examples:
    #|emailid|password|
    #|sandy@gmail.com|sandy@123|
   		
 #	Scenario Outline: Login Functionality without remember me
    #Given I want to open the app
    #Then I want to enter the <emailid>
    #And I want  enter the <password>
#
    #And I want to click on login button
    #
     #Examples:
    #|emailid|password|
    #|sandy@gmail.com|sandy@123|   