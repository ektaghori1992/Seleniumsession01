package Seleniumsession01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsedgeScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Drivers\\msedgedriver.exe");
        WebDriver edgedrv = new EdgeDriver();
        edgedrv.get("https://www.threestrawberry.co.uk/");

    }
}
