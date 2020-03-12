package src.com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com",
                "https://walmart.com",
                "https://westelm.com");

        WebDriver driver=BrowserFactory.getDriver("chrome");
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            String title=driver.getTitle();
            title.replace(" ","");
            title.toLowerCase();
            System.out.println("title = " + title);
            if(urls.get(i).contains(title)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
            Thread.sleep(2000);
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
