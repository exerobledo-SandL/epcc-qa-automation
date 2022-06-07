package pages;

import functional.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ShopRugsPage {
    WebDriver driver;
    String url;

    By closeVIPPopUp = By.xpath("/html/body/div[3]/div[1]/a/span");
    By emailPopUpTextBox = By.xpath("");

    public ShopRugsPage(){
        driver = DriverManager.getInstance().getDriver();
    }

    /*
    This method will retrieve the handler for the Rug Shop page, the index must be handled from the calling method
    Since it can change in relation the amount of tabs opened
     */
    public boolean switchToShopRugs(int handlerIndex){
        try{
            ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(newTab.get(handlerIndex));
        }catch(IndexOutOfBoundsException e){
            return false;
        }
        return true;
    }
    public void closeVIPPopUp(){
        driver.findElement(closeVIPPopUp).click();
    }
    public void submitEmail(String email){
        driver.findElement(emailPopUpTextBox).sendKeys(email);
    }
    public void verifyUIComponents() {
    }
}
