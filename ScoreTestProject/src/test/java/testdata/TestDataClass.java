package testdata;

//Holds Player data for parameterized testing
public class TestDataClass {
	private String playerName;
    private String subTab;
    
    //Constructor
    public TestDataClass(String playerName, String subTab) {
        this.playerName = playerName;
        this.subTab = subTab;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getSubTab() {
        return subTab;
    }
}
