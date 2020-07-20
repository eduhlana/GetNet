@login @all
Feature: Make Login
	
	Scenario Outline: Sucess Login
		Given I visit the website My Store
		When I put the e-mail "<email>" 
		And I put the password "<password>"
		And I click on button Sign In
		Then I will see the message "Welcome to your account. Here you can manage all of your personal information and orders." 
	Examples:
	|email|password|
	|mesquitalana@gmail.com|Teste@2019|
		