package Seleniumsession01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hkisoftware.com/");
        //System.out.println(driver.getTitle());
        String Title = driver.getTitle();
        System.out.println("page Title:"+ Title);
        if(Title.equals("HARIKRUSHNA INFOTECH"))
        {
            System.out.println("Title is correct");
        }
        else
        {
            System.out.println("Title is incorrect");
        }



    }
}
