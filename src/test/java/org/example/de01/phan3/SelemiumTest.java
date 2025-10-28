package org.example.de01.phan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelemiumTest {
    WebDriver driver;

    @BeforeTest
    public void BeforeTest(){
        driver = new ChromeDriver();
    }

    @Test
    public  void registerTest(){
        driver.get("https://hoctotlamhay.vn/register");
        driver.findElement(By.id("name")).sendKeys("tungu");
        driver.findElement(By.id("user_email")).sendKeys("Vantu1212@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Vantu1212");
        driver.findElement(By.linkText("Đăng ký")).click();
        System.out.println("Register successful");
    }

    @Test
    public  void LoginTest(){
        driver.get("https://hoctotlamhay.vn/login");
        driver.findElement(By.id("user_email")).sendKeys("Vantu1212@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Vantu1212");
        driver.findElement(By.linkText("Đăng nhập")).click();
        System.out.println("Login successful");
    }

    @AfterTest
    public  void AFterTest(){
        driver.quit();
    }
}
