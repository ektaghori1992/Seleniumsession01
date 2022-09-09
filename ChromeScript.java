package Seleniumsession01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Drivers\\chromedriver.exe");
        WebDriver dvr = new ChromeDriver();
        dvr.get("https://www.hkisoftware.com/");

    }
}
