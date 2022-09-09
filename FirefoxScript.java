package Seleniumsession01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Software\\Drivers\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://adafftech.com/");
    }
}
