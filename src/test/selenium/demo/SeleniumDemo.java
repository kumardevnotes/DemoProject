package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    static WebDriver driver;
    public static void main(String args[]){
        try {
            String path = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://google.co.in");
            Thread.sleep(3000);
            driver.close();
            driver.quit();
        } catch (Exception e) {
            System.out.println("Caught an exception: "+e);
        }
    }
}
