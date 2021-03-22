package StepDefinations;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.cli.Main;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.MainPage;
import util.BrowserFactory;

public class StepDefination {
	WebDriver driver;
	MainPage mainPage; // creating object
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		mainPage = PageFactory.initElements(driver, MainPage.class);
	}
	@Given ("^User is on the Techfios automation homework page$") 
	public void User_is_on_the_Techfios_automation_homework_page() {
		System.out.println("User is on the Techfios automation Homework Page");
	
	}
	
	@When ("^User click on the button SkyBlue Button$")
	public void User_click_on_the_button_SkyBlue_Button() throws IOException {
		mainPage.colorchange_Method();
		System.out.println("User click on the button SkyBlue Button");
	}
	@Then("^User should see the background color into sky Blue Backgound$")
	public void user_should_see_the_background_color_into_sky_Blue_Backgound() throws IOException  {
		mainPage.colorchange_Method();
		
		System.out.println("User should see the background color into sky Blue Backgound");
	}

	@When("^User click on the button SkyWhile Button$")
	public void user_click_on_the_button_SkyWhile_Button() throws InterruptedException, IOException  {
		mainPage.Colorchange_Method1();
		System.out.println("User click on the button SkyWhile Button");
	}

	@Then("^User should see the background color into sky white Background$")
	public void user_should_see_the_background_color_into_sky_white_Background() throws InterruptedException, IOException  {
		mainPage.Colorchange_Method1();
		System.out.println("User should see the background color into sky white Background");
	}
	@After
	public void TearDown() {
		BrowserFactory.TearDown();
	}
	
}
