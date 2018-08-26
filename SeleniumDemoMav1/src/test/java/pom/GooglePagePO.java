package pom;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;


public class GooglePagePO extends BasePage 
{

	public GooglePagePO(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="q")
	private WebElement searchTxtBX;
	public WebElement searchTxtBx()
	{
		return searchTxtBX;
		
	}
	public void googleSrch(String value)
	{
		searchTxtBX.sendKeys(value);

		searchTxtBX.sendKeys(Keys.ENTER);
		
	}
	

}
