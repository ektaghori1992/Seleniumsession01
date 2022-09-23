package Seleniumsession01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown extends Utils{
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
//        Genric Method
        driver.findElement(By.className("ico-register")).click();
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month =driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year =driver.findElement(By.name("DateOfBirthYear"));
        selectValueFromDropDown(Day,"18");
        selectValueFromDropDown(Month, "May");
        selectValueFromDropDown(Year, "1993");





    }
}
