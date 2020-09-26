package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWindowObject {
	
	public WebDriver driver;
	
	public LoginWindowObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By userName = By.cssSelector("input._2zrpKA._1dBPDZ");
	private By password = By.cssSelector("input._2zrpKA._3v41xv._1dBPDZ");
	private By login = By.cssSelector("button._2AkmmA._1LctnI._7UHT_c");
	
	public WebElement setUserName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement setPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickLogin()
	{
		return driver.findElement(login);
	}
}
