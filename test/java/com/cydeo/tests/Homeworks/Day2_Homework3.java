package com.cydeo.tests.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Homework3 {

    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com ");
        //3- Click to Gmail from top right
        WebElement gmail= driver.findElement(By.className("gb_d"));
        gmail.click();

        Thread.sleep(2000);

        //4- Verify title contains:
        //  Expected: Gmail

        String actualGmail= driver.getTitle();

        if (actualGmail.equals("Gmail")){
            System.out.println("verification PASSED!");
        }else{
            System.out.println("verification FAILED!!!");
        }
        //5- Go back to Google by using the .back();
       driver.navigate().back();
        //6- Verify title equals:
        //  Expected: Google
       String expectedGoogle="Google";

        String actualGoogle = driver.getTitle();

        if (actualGmail.equals(expectedGoogle)){
            System.out.println("verification PASSED!");
        }else{
            System.out.println("verification FAILED!!!");
        }

    }
}
