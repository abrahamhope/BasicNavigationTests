package src.com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
WebDriver driver=BrowserFactory.getDriver("chrome");
driver.get("http://practice.cybertekschool.com/");
String title=driver.getTitle();
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            if(driver.getTitle().equals(title)){
                System.out.println("SAME");
            }else{
                System.out.println("DIFFERENT");
            }
            System.out.println(urls.get(i).startsWith("http://practice.cybertekschool.com"));

        }

        Thread.sleep(2000);
        driver.quit();
    }
}
