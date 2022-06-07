import functional.DriverManager;
import pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LinnkToDesignShop {
    @Test
    public void verifyDesignShopIcon(){

        StartPage startPage = new StartPage();

        Assert.assertTrue(startPage.findDesignShopIcon());
    }
    @AfterTest
    public void tearDown(){
        DriverManager.getInstance().tearDown();
    }
}
