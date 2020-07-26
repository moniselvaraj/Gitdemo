package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bsh.This;

public class loginpage {
	public WebDriver driver;
	//This.driver=driver;
	By emailid=By.xpath("//input[@id='ap_email']");
	By continues=By.xpath("//input[@id='continue']");
	By password1=By.cssSelector("input[id='ap_password']");
	By gotobutton=By.id("signInSubmit");
	
	public loginpage(WebDriver driver) {

		this.driver=driver;
	}
	public WebElement email()
	{
		return driver.findElement(emailid);
	}
	
	public WebElement conts()
	{
		return driver.findElement(continues);
	}
	
	public WebElement pswd() {
		
		return driver.findElement(password1);
		
	}
	
	
	public WebElement gobutton1() 
	{
		return driver.findElement(gotobutton);
		
	}

	
}
