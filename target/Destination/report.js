$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('features\Login.feature');
formatter.feature({
  "line": 2,
  "name": "Make Login",
  "description": "",
  "id": "make-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Sucess Login",
  "description": "",
  "id": "make-login;sucess-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I visit the website My Store",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I put the e-mail \"mesquitalana@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I put the password \"Teste@2019\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on button Sign In",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I will see the message \"Welcome to your account. Here you can manage all of your personal information and orders.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri('features\Order.feature');
formatter.feature({
  "line": 2,
  "name": "As an user I would like to successfully make an order in MyStore",
  "description": "",
  "id": "as-an-user-i-would-like-to-successfully-make-an-order-in-mystore",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@order"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Add an item to cart",
  "description": "",
  "id": "as-an-user-i-would-like-to-successfully-make-an-order-in-mystore;add-an-item-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@order"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am logged in MyStore with user \"Eduardo Mesquita de Lana\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I choose one category \"WOMEN\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I choose one item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on button Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I will see \"Product successfully added to your shopping cart\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Proceed to checkout",
  "description": "",
  "id": "as-an-user-i-would-like-to-successfully-make-an-order-in-mystore;proceed-to-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I clicked on button Proceed to checkout",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I see the summary",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify my informations",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I agree the terms of service",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I choose my payment",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I will see message \"Your order on My Store is complete.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});