Feature: App login

Scenario: displaying home page after login
  Given Customer is in login page
  When Customer login with username and password
  Then Customer will see the home page
  And Customer name with card details are shown




