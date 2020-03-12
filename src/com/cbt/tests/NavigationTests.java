package src.com.cbt.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.cbt.utilities.BrowserFactory;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {
        chromeTest();
        safariTest();
        firefoxTest();
    }
/*
1. Open browser
2.Go to website https://google.com
3. Save the title in a string variable
4. Go to https://etsy.com
5. Save the title in a string variable
6. Navigate back to previous page
7. Verify that title is same is in step 3
8. Navigate forward to previous page
9. Verify that title is same is in step 5
 */
public static void chromeTest() throws InterruptedException {
    WebDriver driver= BrowserFactory.getDriver("chrome");
    driver.get("https://google.com");
    String titleGoogle= driver.getTitle();
    Thread.sleep(2000);

    driver.get("https://etsy.com");
    String titleEtsy=driver.getTitle();
    driver.navigate().back();

    Boolean isTitleSame=titleGoogle.equals(driver.getTitle());

    driver.navigate().forward();
    Boolean isTitleEqual=titleEtsy.equals(driver.getTitle());

    driver.quit();
}
    public static void safariTest() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String titleGoogle= driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String titleEtsy=driver.getTitle();
        driver.navigate().back();

        Boolean isTitleSame=titleGoogle.equals(driver.getTitle());

        driver.navigate().forward();
        Boolean isTitleEqual=titleEtsy.equals(driver.getTitle());

        driver.quit();
    }

    public static void firefoxTest() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String titleGoogle= driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String titleEtsy=driver.getTitle();
        driver.navigate().back();

        Boolean isTitleSame=titleGoogle.equals(driver.getTitle());

        driver.navigate().forward();
        Boolean isTitleEqual=titleEtsy.equals(driver.getTitle());

        driver.quit();
    }

}
