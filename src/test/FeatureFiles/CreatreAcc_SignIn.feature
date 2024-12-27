Feature: Luma Create Acc- Sign in
  Scenario: Create an Account
    Given User launch the browser and navigates to LUMA home page
    When User clicks on Create an Account button
    Then User should be navigated to "Create New Customer Account" page
    And User enters first name as "Pratik" and last name as "Kadam"
    And User enters email as "kpratik2238@gmail.com"
    And User enters password as "Luma@2238"
    And User Clicks on Create an Account button
    Then User shuld be navigated to "My Account" page


    Scenario: Sign in
      Given User launch the browser and navigates to LUMA home page
      When User clicks on Sign in button
      Then "Customer Login" page should appeare
      And User enters email for signin "kpratik2238@gmail.com"
      And User enters password for signin "Luma@2238"
      And user clicks on Sign in button1
      Then User should be navigated to "Home Page" page
