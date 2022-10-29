package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task4_librarypageRetry {

    @Test
    public void test1(){
        //1. Open Chrome browser
        //2. Go to http://library2.cybertekschool.com/login.html
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
        //3. Enter username: “incorrect@email.com”
        WebElement username=Driver.getDriver().findElement(By.id("inputEmail"));
        username.sendKeys("incorrect@mail.com");
        //4. Enter password: “incorrect password”
        WebElement password =Driver.getDriver().findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        WebElement signInButton=Driver.getDriver().findElement(By.xpath("//button[.='Sign in']"));
        signInButton.click();
        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        WebElement wrongMessage = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-danger']"));
        wrongMessage.isDisplayed();
    }
}
