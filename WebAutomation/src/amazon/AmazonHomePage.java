package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePage {

    public static void main(String[] args) {


        String driverPath="C:\\Users\\elite\\IdeaProjects\\WebAutomation\\ExternalLib\\chromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();



    }


}


