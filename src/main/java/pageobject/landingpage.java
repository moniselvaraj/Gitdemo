package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {

	public WebDriver driver;
	By signin=By.xpath("//span[contains(text(),'Hello, Sign in')]");
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement siginbutton()
	{
		return driver.findElement(signin);
	}
	public loginpage getLogin() {
		// TODO Auto-generated method stub
		return null;
	}
}
