package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	// body[style=\"background-color: skyblue;\"]

	//
	// body[style=\"background-color: white;\"]

	@FindBy(how = How.XPATH, using = "//button[text()=\"Set SkyBlue Background\"]")
	WebElement SkyBlue_Button;

	@FindBy(how = How.CSS, using = "body[style=\"background-color: skyblue;\"]")
	WebElement SkyBlue_Button_Color;

//	@FindBy(how = How.CSS, using= "//body[@style=\"background-color: skyblue;\"]") 
//	WebElement Assert_SkyBlue_Color_Only.

	@FindBy(how = How.XPATH, using = "//button[text()=\"Set White Background\"]")
	WebElement SkyWhite_BUtton;

	public void colorchange_Method() throws IOException {
		SkyBlue_Button.click();
		takeScreenshotAtEndOfTest(driver);
		System.out.println("The Color Shown: "
				+ driver.findElement(By.xpath("//body[@style=\"background-color: skyblue;\"]")).getAttribute("style"));
		
	}

	public void Colorchange_Method1() throws IOException  {
		SkyBlue_Button.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Set SkyBlue Background\"]")));
		// waitforElement(driver, 15, SkyBlue_Button_Color);
		SkyWhite_BUtton.click();
		takeScreenshotAtEndOfTest(driver);
		System.out.println("The Color Shown in background second time: "
				+ driver.findElement(By.xpath("//body[@style=\"background-color: white;\"]")).getAttribute("style"));
		
	}
	
}