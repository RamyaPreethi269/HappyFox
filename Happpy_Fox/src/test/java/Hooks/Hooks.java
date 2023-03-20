package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.happyfox.Baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {

	@After
	public void afterHooks(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "Screenshot");
		driver.quit();
	}

}
