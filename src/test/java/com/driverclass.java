package com;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class driverclass {
    public static WebDriver driver;
    public void openBrowser()throws IOException {
        String browser;
        browser = System.getProperty("browser");
        if (browser.equalsIgnoreCase("CHROME")) {
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FIREFOX")){
            FirefoxDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            InternetExplorerDriverManager.iedriver();
            driver = new FirefoxDriver();
        }
        driver.get("https://www.getthelabel.com/");
        driver.manage().window().maximize();
    }
    public void closeBrowser() {
//        driver.close();
    }
}
