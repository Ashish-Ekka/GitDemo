package resources;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoOfProducts {
	
	public WebDriver driver;
	
	public NoOfProducts(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebDriver getNoOfProducts() throws InterruptedException
	{
		MainPage mp = new MainPage(driver);
		
		List<WebElement> list = mp.noOfProducts();
		int count = list.size();
		System.out.println(count);
		Iterator<WebElement> it =list.iterator(); 
		while(it.hasNext())
		{
			WebElement wb = it.next();
			String pName = wb.getText();
			//System.out.println(pName);
			if(pName.contentEquals("Redmi K20 Pro (Glacier Blue, 128 GB)"))
			{
		
				wb.click();
			
				//Thread.sleep(4000);
				Set<String> handle = driver.getWindowHandles();
				Iterator<String> winHandle = handle.iterator();
				String parentWindow = winHandle.next();
				String childWindow = winHandle.next();
				driver.switchTo().window(childWindow);
				
//				MainPage mp1 = new MainPage(driver);
//				mp1.setPincode().sendKeys("140126");
//				mp1.setPincode().sendKeys(Keys.ENTER);
				//System.out.println("after switching");
			}
			
		}
		return driver;
	}
	
	public void getAddress()
	{
		MainPage mp = new MainPage(driver);
		List<WebElement> addressList = mp.getAddress();
		Iterator<WebElement> it = addressList.iterator();
		while(it.hasNext())
		{
			WebElement add = it.next();
			String address = add.getText();
			if(address.contentEquals("House No.22"))
			{
				add.click();
				mp.deliverButton().click();   //deliver here
			}
		}
	}
	
	//product for check-out
	public void checkProductDetail()
	{
		MainPage mp = new MainPage(driver);
		String finalProduct = mp.finalProductNameCheck().getText();
		if(finalProduct.equals("Redmi K20 Pro (Glacier Blue, 128 GB)"))
		{
			//checking price
			String amount = mp.finalPriceCheck().getText();
			if(amount.equals("₹22,999"))
			{
				mp.clickOnContinue();
			}
		}
	}
	
	

}
