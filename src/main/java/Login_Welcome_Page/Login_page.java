package Login_Welcome_Page;

import java.io.IOException;

import org.openqa.selenium.By;

import Browser_Config.Browser_Launcher;

public class Login_page extends Browser_Launcher
{
	
	

	
	public void Login_Page_TC(String Banker_Username , String Banker_Password) throws IOException
	{
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/input")).sendKeys(Banker_Username);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Banker_Password);

		driver.findElement(By.xpath("//*[@id=\"clicked_when_enter_id\"]")).submit();
	}
}
