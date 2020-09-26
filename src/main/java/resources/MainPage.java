package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	public WebDriver driver;
	public MainPage(WebDriver driver)
	{
		this.driver = driver;
	}
	private By searchProduct = By.cssSelector("input.LM6RPg");
	private By wholePage = By.cssSelector("div._3wU53n");
	private By pincode = By.id("pincodeInputId");
	private By buy = By.cssSelector("button._2AkmmA._2Npkh4._2kuvG8._7UHT_c");
	private By address = By.cssSelector("span._22O2Xt.GeUS8P");
	private By deliverHere = By.cssSelector("button._2AkmmA._I6-pD._7UHT_c");
	private By finalProduct = By.cssSelector("div._325-ji");
	private By finalPrice = By.xpath("(//div[@class='_3GoQc2'])[2]");
	private By continueButton = By.cssSelector("button._2AkmmA._2Q4i61._7UHT_c");
	
	public WebElement search()
	{
		return driver.findElement(searchProduct);
	}
	
	public List<WebElement> noOfProducts()
	{
		return driver.findElements(wholePage);
	}
	
	public WebElement setPincode()
	{
		return driver.findElement(pincode);
	}
	
	public WebElement clickOnBuy()
	{
		return driver.findElement(buy);
	}
	
	public List<WebElement> getAddress()
	{
		return driver.findElements(address);
	}
	
	public WebElement deliverButton()
	{
		return driver.findElement(deliverHere);
	}
	
	public WebElement finalProductNameCheck()
	{
		return driver.findElement(finalProduct);
	}
	
	public WebElement finalPriceCheck()
	{
		return driver.findElement(finalPrice);
	}
	
	public WebElement clickOnContinue()
	{
		return driver.findElement(continueButton);
	}
	
}
