package com.qa.cucumber.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
 
	WebDriver driver;
    WebDriverWait Wait;
	
@Given("User open the browser")
public void user_open_the_browser()
 {
	driver = new ChromeDriver();
	Wait = new WebDriverWait(driver, 20);
 }
 @And("user maximize the browser")
public void user_maximize_the_browser() 
 {
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

 @When("User open the Url {string}")
 public void user_open_the_url(String appUrl) 
 {
  driver.get(appUrl);  
 }

@Then("User is gets redirected to {string}")
public void user_is_gets_redirected_to(String appExpectedUrl) 
{
    Assert.assertEquals("user is gets not redirected", appExpectedUrl, driver.getCurrentUrl());
}

  
// Then User is able to see the app title "My Store"
@Then("User is able to see the app title {string}")
public void user_is_able_to_see_the_app_title(String appLandingPageTitle) {
	Assert.assertEquals("Page title is incorrect",appLandingPageTitle, driver.getTitle());

}
// And User clicks on signin button
@And("User clicks on signin button")
public void user_clicks_on_signin_button() {
	WebElement signInButton = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	signInButton.click();
}

// When User enter his registered "usertest123@gmail.com"
@When("User enter his registered {string}")
public void user_enter_his_registered(String string) {
	WebElement userEmailIdField = driver.findElement(By.id("email"));
	Wait.until(ExpectedConditions.visibilityOf(userEmailIdField));
	userEmailIdField.sendKeys("amloginin@gmail.com");
}

// And User enters his password "John123!"
@When("User enters his password {string}")
public void user_enters_his_password(String string) throws InterruptedException {
	WebElement userPasswordField = driver.findElement(By.id("passwd"));
	Wait.until(ExpectedConditions.visibilityOf(userPasswordField));
	userPasswordField.sendKeys("AM789");
	Thread.sleep(2000);
}

// And User clicks on signin button
@When("And User clicks on signin button")
public void And_User_clicks_on_signin_button() {
	WebElement signinButton = driver.findElement(By.id("SubmitLogin"));
	signinButton.click();
	
}
@Then ("logo in the landing page is display")
		public void  logo_in_the_landing_page_is_display() throws InterruptedException
		{
	
	 driver.findElement(By.xpath("//img[@alt='My Store']")).click();
	
	 Thread.sleep(2000);
	 
}
@Then ("User Validate Application Logo height={int} AND width={int}")
    public void User_Validate_Application_Logo_Hight_and_Width() throws InterruptedException
   {
	   int width = driver.findElement(By.xpath("//img[@class='logo img-responsive']")).getSize().getWidth();
       int height = driver.findElement(By.xpath("//img[@class='logo img-responsive']")).getSize().getHeight();
       Assert.assertEquals(width, 350);
       Assert.assertEquals(height, 99);
	
    
    Thread.sleep(3000);
   
    }
 @When ("Enter the Email address{string}")
 public void Enter_the_Email_address()
 {
      WebElement newEmailAdress = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input"));
  	Wait.until(ExpectedConditions.visibilityOf(newEmailAdress));

      newEmailAdress.sendKeys("youloginin@gmail.com");
}
 @And ("Click on Create an account button")
 public void Click_on_Create_an_account_button()
 {
	 WebElement createaAnAccount = driver.findElement(By.id("//button[@id='SubmitCreate']"));
	 createaAnAccount.click();
	 }
 

}
