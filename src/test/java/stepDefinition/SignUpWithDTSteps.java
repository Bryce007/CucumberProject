package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtils.BaseClass;

public class SignUpWithDTSteps extends BaseClass {

	@When("^I provide the following details$")
	public void i_provide_the_following_details(DataTable table) throws Throwable {
		List<Map<String, String>> maps = table.asMaps(String.class, String.class);

		for (Map<String, String> map : maps) {
			WebElement dd = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
			Thread.sleep(2000);
			Select dropdown = new Select(dd);
			dropdown.selectByVisibleText(map.get("Edition"));

			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(map.get("FirstName"));
			driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(map.get("LastName"));
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(map.get("Email"));
			driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys(map.get("ConfirmEmail"));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(map.get("UserName"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(map.get("Password"));
			driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys(map.get("ConfirmPassword"));
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
			driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			
			driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys(map.get("Company"));
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(map.get("Phone"));
			
			 driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
			 driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();

		}
		
		

	}

}