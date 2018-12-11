package com.syntax.cucumberproject.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {
	WebDriver driver;
	
	@Given("^I open browser$")
	public void i_open_the_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().fullscreen();
	}

	@Given("^I navigate to FreeCrm$")
	public void i_navigate_to_FreeCrm() throws Throwable {
	   String url="https://www.freecrm.com/index.html";
		driver.get(url);
	}

	@When("^I am on the site click on Sign up$")
	public void i_am_on_the_site_click_on_Sign_up() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains (text(), 'Sign Up')]")).click();
	}

	@When("^I click on dropdown and select free edition$")
	public void i_click_on_dropdown_and_select_free_edition() throws Throwable {
	    WebElement dd=driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	    Thread.sleep(2000);
	    Select dropdown=new Select(dd);
	    dropdown.selectByVisibleText("Free Edition");
	}

	@When("^I enter new user information$")
	public void i_enter_new_user_information() throws Throwable {
	    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Michael");
	    driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Jordan");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("MJ23@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("MJ23@gmail.com");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mj123456");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bulls23");
	    driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("bulls23");
	    
	    
	}

	@When("^I check agree terms box$")
	public void i_check_agree_terms_box() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	}

	@When("^I fill in company name and number$")
	public void i_fill_in_company_name_and_number() throws Throwable {
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Bulls");
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567");
	}

	@When("^I click on Continue$")
	public void i_click_on_Continue() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
	}

	@Then("^I have successfully created new user$")
	public void i_have_successfully_created_new_user() throws Throwable {
	   boolean finish= driver.findElement(By.xpath("//span[@class='text_normal']")).isDisplayed();
	   
	   Assert.assertTrue(finish);
	   
	}
	@Then("^I quit the browser$")
	public void i_quit_browser() throws Throwable {
	    driver.quit();
	}
	





}
