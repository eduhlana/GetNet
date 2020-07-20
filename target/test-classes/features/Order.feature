@order @login
Feature: As an user I would like to successfully make an order in MyStore 

	Scenario Outline: Add an item to cart 
		Given I am logged in MyStore with user "<user>"
		When I choose one category "<category>" 
		And I choose one item 
		And I click on button Add to Cart 
		Then I will see "Product successfully added to your shopping cart" 
		Examples: 
			|user|category|
			|Eduardo Mesquita de Lana|WOMEN|
	Scenario: Proceed to checkout 
		Given I clicked on button Proceed to checkout 
		When I see the summary
		And I verify my informations
		And I agree the terms of service
		And I choose my payment
		And I confirm my order
		Then I will see message "Your order on My Store is complete." 
	