package Seleniumsession01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegisterPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
       driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
//      Navigation
//        driver.findElement(By.className("ico-login")).click();
//      Navigation back
//        driver.navigate().back();
//      Navigation Forward
//        driver.navigate().forward();
//        Thread.sleep(2000);
//      Maximize the window
//        driver.manage().window().maximize();
//      Minimize the window
//        driver.manage().window().minimize();
//      Refresh the page
//        driver.navigate().refresh();
//      Get current URl
//        String Url = driver.getCurrentUrl();
//        System.out.println("current Url:"+Url);
//      Close the browser
//          driver.quit();
//      close particular tab or window
//        driver.close();
//      Expected vs Actual Validation
        
//        driver.findElement(By.className("ico-login")).click();
//        driver.findElement(By.id("Email")).sendKeys("ekta@123gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("ekta$123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
//        driver.findElement(By.linkText("Wishlist")).click();
//        driver.findElement(By.partialLinkText("Wish")).click();
//        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ekta");
        driver.findElement(By.id("LastName")).sendKeys("Ghori");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("20th");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1998");
//      Genric Method
//        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
//        WebElement Month =driver.findElement(By.name("DateOfBirthMonth"))
//        WebElement Year =driver.findElement(By.name("DateOfBirthYear"));

        driver.findElement(By.id("Email")).sendKeys("ekta@123gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ekta$123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("ekta$123");
        driver.findElement(By.id("register-button")).click();
    }
}
