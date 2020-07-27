package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
public WebDriver driver;
	
	public WebDriver initial() throws IOException
	{
		
		Properties pro=new Properties();
		File file;
		FileInputStream fis= new FileInputStream("C:\\Users\\Monisha\\eclipse-workspace\\framework\\src\\main\\java\\resource\\data.properties");
		pro.load(fis);
		String browname=pro.getProperty("browser");
		if (browname.equals("chrome"))	
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\Downloads\\chromedriver.exe");
			 driver =new ChromeDriver();
				System.out.println("chrome open page");

			
		}
		else if(browname.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Monisha\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 driver= new FirefoxDriver();
				System.out.println("firefox open  page");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
