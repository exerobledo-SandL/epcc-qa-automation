import pages.StartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LogIn {
    @Test
    public void login(){
        StartPage start = new StartPage();

        String cartmsg = start.getCartMessage();
        System.out.println(cartmsg);
        start.goToShopRugs();
        start.changeToRugsTab();

    }
    @AfterTest
    public void tearDown(){

        //functional.DriverManager.getInstance().tearDown();
    }
}
