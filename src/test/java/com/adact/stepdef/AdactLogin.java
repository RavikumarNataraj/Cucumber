package com.adact.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactLogin {

	WebDriver driver;
	@Given("Launch the Browser")
	public void launch_the_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Given("open the adactin page")
	public void open_the_adactin_page() {
		driver.get("https://adactinhotelapp.com/");
		System.out.println("maheswari");
	}
	
	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}

	@When("click the login button")
	public void click_the_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Outcome");
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
		driver.close();
	}

}
