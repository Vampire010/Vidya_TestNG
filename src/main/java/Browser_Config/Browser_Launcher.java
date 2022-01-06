package Browser_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launcher
{

public static  WebDriver driver ;
	
	public String browser(String browser_Type , String URL )
	{
		if(browser_Type.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\eclipse-workspace\\Vidya_POM_Framework\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
		}
		else if(browser_Type.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91973\\eclipse-workspace\\Vidya_POM_Framework\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
		}
		
		else if(browser_Type.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\91973\\eclipse-workspace\\Vidya_POM_Framework\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(URL);
		}
		else
		{	
			System.out.print("Given Browser Type is Not Matching");
		}
		
		return URL;
	}
}
