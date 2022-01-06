package Test_Runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login_Welcome_Page.Login_page;

public class Login_Test_Runner 
{
	String Browser_Type = "chrome";
	String Test_Url = "https://73343.mykidsbank.org/";

	
	Login_page lp = new Login_page();
	
	@BeforeMethod
	public void open_browser()
	{
		lp.browser(Browser_Type, Test_Url);
	}
	
	@Test
	public void login_TC1() throws IOException
	{
		String Banker_Username = "banker";
		String Banker_Password = "girish1234";
		lp.Login_Page_TC(Banker_Username,Banker_Password);
	}
	
	@Test
	public void login_TC2() throws IOException
	{
		String Banker_Username = "banker";
		String Banker_Password = "girish1234";
		lp.Login_Page_TC(Banker_Username,Banker_Password);
	}
	
	@Test
	public void login_TC3() throws IOException
	{
		String Banker_Username = "";
		String Banker_Password = "";
		lp.Login_Page_TC(Banker_Username,Banker_Password);
	}
	
	@AfterMethod
	public void close_Browser()
	{
		lp.driver.close();
	}

}
