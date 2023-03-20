package com.happyfox.Baseclass;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static void browserlaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		window_max();
	}

	public static void getURL(String url) throws InterruptedException {
		driver.get(url);
	}
	
	public static void Naviagte_URL(String url) throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to(url);
		driver.navigate().refresh();
	}
	
	public static void window_max() {
		driver.manage().window().maximize();
	}
	
	public static WebDriverWait WB_wait() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(50));
		return wb;
	}
	
	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed=false;
		try {
			WB_wait().until(ExpectedConditions.visibilityOfAllElements(element));
			displayed=element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not dispalyed:"+e.getMessage());
		}
return displayed;
	}
	
	public static void elementSendKeys(WebElement element,String value) {
		try {
			WB_wait().until(ExpectedConditions.visibilityOfAllElements(element));
			elementClear(element);
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Unable to Pass the value :"+e.getMessage());
		}

	}
	
	public static void ASendkeys(WebElement element, String value) {
		try {
			Actions ac=new Actions(driver);
			ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			System.out.println("Unable to Pass the value :"+e.getMessage());
		}

	}
	
	public static void elementClear(WebElement element) {
try {
	element.clear();
} catch (Exception e) {
	// TODO: handle exception
}
	}
	
	public static void elementClick(WebElement element) {
		try {
			WB_wait().until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			System.out.println("Unable to click:"+e.getMessage());
		}

	}
	
	public static String getText(WebElement element) {
		String text=null;
		try {
			text=element.getText();
		} catch (Exception e) {
			System.out.println("unable to fetch the text :"+e.getMessage());
		}
return text;
	}
	
	public static String PropertyRead(String key) throws IOException {
		String path=".\\src\\test\\resources\\property file\\Testdata.properties";
		String value=null;
		try {
			FileReader f=new FileReader(path);
			Properties pro=new Properties();
			pro.load(f);
				 value = pro.getProperty(key);
		} catch (Exception e) {
			
		}
		return value;
	}
	
	public static void mouseHover(WebElement element) {
	try {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	} catch (Exception e) {
		System.out.println("Unable to hover :"+e.getMessage());
	}

	}
	
	public static void Selectdrop(WebElement element,String value) {
		try {
			Actions ac=new Actions(driver);
			ac.sendKeys(element,Keys.ENTER, value).build().perform();
		   
		}
		catch(Exception e) {
			System.out.println("unable to click :"+e.getMessage());
	}
	}
	
	public static void AEnter(WebElement element) {
		try {
			Actions ac=new Actions(driver);
			ac.sendKeys(element,Keys.ENTER).build().perform();
		   
		}
		catch(Exception e) {
			System.out.println("unable to click :"+e.getMessage());
	}
	}
		
		public static void JSclcick(WebElement element) {
	try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
	}
	catch(Exception e) {
		System.out.println("unable to click :"+e.getMessage());
             }
		}
	}

