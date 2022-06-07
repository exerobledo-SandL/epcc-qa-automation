package pages;

import functional.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;

public class StartPage {
    WebDriver driver;
    String urlStartPage;

    By cartIcon = By.xpath("//*[@id='__next']/div[1]/div/div[3]/div[3]");
    By cartDescription = By.xpath("//*[@id='__next']/div[1]/div/div[3]/div[3]/div/p");
    By shopRugsButton = By.xpath("//*[@id='defaultBanner']/a/div/div/div[2]/a");
    By selenaAndLilyBanner = By.xpath("//*[@id='__next']/div[1]/div/div[2]/a/img");
    By search = By.xpath("//*[@id='__next']/div[1]/div/div[3]/div[1]");
    By designShopIcon = By.xpath("//*[@id='__next']/div[1]/div/div[3]/div[2]/a");

    public StartPage(){
        driver = DriverManager.getInstance().getDriver();
        urlStartPage = "https://serenaandlily-nextjs-develop.vercel.app/";
        driver.get(urlStartPage);
    }
    public void goToShopRugs(){
        driver.findElement(shopRugsButton).click();
    }

    public void changeToRugsTab() {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        Iterator it = newTab.iterator();
        driver.switchTo().window(newTab.get(1));
    }
    public String getCartMessage(){
        driver.findElement(cartIcon).click();
        return driver.findElement(cartDescription).getText();
    }
    public boolean findUIElements(){
        System.out.println("Banner image url: "+driver.findElement(selenaAndLilyBanner).getAttribute("src"));
        driver.findElement(search);
        //driver.findElement(locationIcon);
        return false;
    }
    public boolean findDesignShopIcon(){
        return driver.findElement(designShopIcon).isDisplayed();
    }
}
