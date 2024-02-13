package testdata;

import org.testng.annotations.DataProvider;

//Class to provide test data for parameterized testing
public class TestDataProviderClass {
	
	//Provides test data  - player name and subtab
	@DataProvider(name = "playerData")
	public static Object[][] provideplayerData() {
        return new Object[][]{
            {"LeBron James", "INFO"}
        };
    }
}
