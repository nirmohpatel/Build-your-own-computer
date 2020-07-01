package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Custom_Performance_PC
{
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Soft\\Chrome_Driver\\83\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//div[@class=\"side-2\"]/div/div[2]/ul/li/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/h2/a")).click();
        driver.findElement(By.xpath("//input[@class=\"button-2 email-a-friend-button valid\"]")).click();
        driver.findElement(By.xpath("//input[@value=\"Send email\"]")).click();
        String pageText1=driver.findElement(By.xpath("//span[contains(@id,\"FriendEmail-error\")]")).getText();
        System.out.println(pageText1);
        String pageText2=driver.findElement(By.xpath("//span[@id=\"YourEmailAddress-error\"]")).getText();
        System.out.println(pageText2);
    }
}
