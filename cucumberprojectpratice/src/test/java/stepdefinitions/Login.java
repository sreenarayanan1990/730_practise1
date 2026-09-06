package stepdefinitions;

import static utils.CommonUtils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("user should be in login page")
	public void user_should_be_in_login_page() {

		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=91B2770F787E826D7CF83D40E4BD150C");
		if (driver.findElement(By.xpath("//h2[text()='Customer Login']")).isDisplayed()) {

			System.out.println("pass");

		} else {

			System.out.println("fail");
		}

	}

	@When("user should enter valid credentails and submit")
	public void user_should_enter_valid_credentails_and_submit() {

		driver.findElement(By.name("username")).sendKeys("san123");
		driver.findElement(By.name("password")).sendKeys("san123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("user should navigate to welcome page of app")
	public void user_should_navigate_to_welcome_page_of_app() {

		if (driver.findElement(By.xpath("//h2[text()='Account Services']")).isDisplayed()) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
