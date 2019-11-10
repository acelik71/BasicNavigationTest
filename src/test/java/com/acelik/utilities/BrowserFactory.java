package com.acelik.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.apache.commons.exec.OS;

public class BrowserFactory {

    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            case "safari":
                if (OS.isFamilyWindows()) {
                    driver = null;
                    break;
                } else {
                    driver = new SafariDriver();
                    break;
                }
            case "edge":
                if (OS.isFamilyMac()) {
                    driver = null;
                    break;
                } else {
                     WebDriverManager.edgedriver().setup();
                     driver = new EdgeDriver();
                     break;
                }
        }
        return driver;
    }
}
