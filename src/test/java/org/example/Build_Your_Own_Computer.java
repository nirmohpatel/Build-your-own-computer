package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Build_Your_Own_Computer
{ static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\Chrome_Driver\\83\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a")).click();

        driver.findElement(By.xpath("//div[@class=\"listbox\"]/ul/li/ul/li[1]/a")).click();
        //driver.findElement(By.xpath("//div[@class=\"side-2\"]/div/div[2]/ul/li/ul/li[1]/a")).click();

        String pageText=driver.findElement(By.xpath("//div[@class=\"center-2\"]/div/div[2]/div[3]/div/div[1]/div/div[2]/h2/a")).getText();
        System.out.println(pageText);
    }
}
