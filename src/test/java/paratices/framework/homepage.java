package paratices.framework;

import java.io.IOException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import pageObjects.ForgotPassword;
//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
import pageobject.landingpage;
import pageobject.loginpage;
//import resources.base;
import resource.base;

public class homepage extends resource.base{
	public WebDriver driver;
	
	 public static java.util.logging.Logger log =java.util.logging.Logger.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initial();

	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{

		//one is inheritance

		// creating object to that class and invoke methods of it
		//driver.get(pro.getProperty("url"));
		landingpage l=new landingpage(driver);
		loginpage lp=l.getLogin(); //driver.findElement(By.css()
		lp.email().sendKeys(Username);
		lp.pswd().sendKeys(Password);

		log.info(text);
		
		lp.gobutton1().click();
		//ForgotPassword fp= lp.forgotPassword();
		//fp.getEmail().sendKeys("xxx");
		//fp.sendMeInstructions().click();
		
		
		
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restrcited User";
		//1st row
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]= "Non restricted user";
		
		return data;
		
		
		
		
		
		
	}
	
}
