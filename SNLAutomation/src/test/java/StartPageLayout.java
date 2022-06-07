import functional.DriverManager;
import pages.StartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class StartPageLayout {
    @Test
    public void verifyLayOut(){
        StartPage startPage = new StartPage();

        startPage.findUIElements();
    }
    @AfterTest
    public void tearDown(){
        DriverManager.getInstance().tearDown();
    }
}
