package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{
	public static WebDriverWait wait;
	
	public static void click(WebElement wb)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
		
	}
	public static void sendKeys(WebElement wb, String s)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(s);
		
	}
	
	public static void clear(WebElement wb)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb)).clear();
	}
	
	
	

	

}
