package com.cydeo.tests.Homeworks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day3_Homework1 {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //2- Go to:
        Driver.getDriver().get("https://login1.nextbasecrm.com/");
        //3- Enter incorrect username: “incorrect”
        WebElement incorrectUsername=Driver.getDriver().findElement(By.className("login-inp"));
        incorrectUsername.sendKeys("incorrect");
        //4- Enter incorrect password: “incorrect”
        WebElement incorrectPassword=Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        incorrectPassword.sendKeys("incorrect");
        //5- Click to login button.
        WebElement loginButton=Driver.getDriver().findElement(By.className("login-btn"));
        loginButton.click();
        //6- Verify error message text is as expected:

        //Expected: Incorrect login or password
        WebElement errorMessage=Driver.getDriver().findElement(By.className("errortext"));

        String expectedErrorMessage="Incorrect login or password";
        String actualErrorMessage=errorMessage.getText();
        //
    }
}
