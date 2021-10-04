


@smoke
Feature: Test the e-commerce app landing page
  For smoke test
  1. URL Redirection
  2. Landing page title test
  

  @appOpen
  Scenario: Test the Url redirection for the application
    Given User open the browser
    And user maximize the browser
    When User open the Url "http://automationpractice.com/"
    Then User is gets redirected to "http://automationpractice.com/index.php"
    And User close the browser
    
    
    @loginPage
    Scenario: User Login page
    Given User open the browser
    And user maximize the browser
    When User open the Url "http://automationpractice.com/"
    Then User is gets redirected to "http://automationpractice.com/index.php"
     And User clicks on signin button
    When User enter his registered "amloginin@gmail.com"
    And User enters his password "AM789"
    And User clicks on signin button 
    
    @LogoDisplay
    Scenario: Landing Page Application Logo Display Test
    
     Given User open the browser
     And user maximize the browser
     When User open the Url "http://automationpractice.com/"
    Then logo in the landing page is display
    
    
   @logoHight
   Scenario:  Validate Application Logo Height and Width On Landing page
     Given User open the browser
     And user maximize the browser
     When User open the Url "http://automationpractice.com/"
     Then User Validate Application Logo height AND width
     
      @RegisterForm
    Scenario:  Ragister user with new Email Id on Sign in page 
    Given User open the browser
    And user maximize the browser
    When User open the Url "http://automationpractice.com/"
    Then User is gets redirected to "http://automationpractice.com/index.php"
     And User clicks on signin button
     When Enter the Email Address  "youloginin@gmail.com"
     And Click on Create an account button
     
   
 
    
    