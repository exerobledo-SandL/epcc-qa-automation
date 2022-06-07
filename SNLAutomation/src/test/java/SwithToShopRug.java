import functional.DriverManager;
import pages.ShopRugsPage;
import pages.StartPage;
import org.testng.annotations.Test;

public class SwithToShopRug {
    @Test
    public void switchToRugShop(){
        StartPage start = new StartPage();
        start.goToShopRugs();

        ShopRugsPage shopRugs = new ShopRugsPage();
        shopRugs.switchToShopRugs(1); //ver de manejarlo mas elegantemente

        shopRugs.verifyUIComponents();
        shopRugs.closeVIPPopUp();

    }
    public void tearDown(){
        DriverManager.getInstance().tearDown();
    }
}
