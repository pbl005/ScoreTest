package tests;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

import setup.TestSetup;
import testdata.TestDataClass;

public class PlayerTest extends TestSetup {
	
	//Constructor
	public PlayerTest(AppiumDriver driver) {
		super(driver);
	}	
	
	private By SearchBar = By.xpath("//XCUIElementTypeSearchField[@name='Search']");
	
	@Test 
	public void testPlayer(TestDataClass playerdata) throws InterruptedException{
		
				
		driver.findElement(SearchBar).click();
    	driver.findElement(SearchBar).sendKeys(playerdata.getPlayerName());
    	
    	//Verify the title of the page has Player's name
    	Assert.assertTrue(driver.getTitle().contains(playerdata.getPlayerName()),"Player page not opened correctly");
    	
    	driver.findElement(By.name(playerdata.getSubTab())).click();
    	
    	//Verify Correct subtab is opened
    	Assert.assertTrue(driver.getTitle().contains("Birth Date"),"Subtab not opened correctly");
    	
    	//Navigate back
    	driver.navigate().back();
    	
    	//Verify back navigation returns to previous page
    	Assert.assertEquals(driver.findElement(SearchBar).isDisplayed(),"Back Navigation is not working");
}


	
}
