package Automation.Flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.LoginWindowObject;
import resources.MainPage;
import resources.NoOfProducts;

public class HomePage extends DriverSetup{

	public WebDriver driver;
	@BeforeTest
	public void beforeMethod()
	{
		driver = driverInitializer();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void Login() throws InterruptedException
	{
		LoginWindowObject l = new LoginWindowObject(driver);
		l.setUserName().sendKeys("7206000870");
		l.setPassword().sendKeys("iamawesome");
		l.clickLogin().click();
		Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void searchProduct()
	{
		MainPage mp = new MainPage(driver);
		mp.search().sendKeys("Redmi K20 Pro");
		mp.search().sendKeys(Keys.ENTER);
	}
	
	@Test(dependsOnMethods= {"Login","searchProduct"})
	public void searchNoOfPoroducts() throws InterruptedException
	{
		NoOfProducts np = new NoOfProducts(driver);
		np.getNoOfProducts();
		
	}
	
	@Test
	public void setPincode() throws InterruptedException
	{
		MainPage mp = new MainPage(driver);
	
		mp.setPincode().sendKeys("140126");
		mp.setPincode().sendKeys(Keys.ENTER);
	}
}
