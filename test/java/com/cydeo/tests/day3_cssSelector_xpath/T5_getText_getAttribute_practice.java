package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_getAttribute_practice {

    public static void main(String[] args) {


        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");
        //3- Enter incorrect username into login box:
        WebElement username = driver.findElement(By.cssSelector("input[class='login-inp']"));
        username.sendKeys("incorrect");

        //4- Click to `Reset password` button
        WebElement resetPassword= driver.findElement(By.cssSelector("div[class='log-popup-footer']>button"));
        resetPassword.click();

        //5- Verify “error” label is as expected
        String expectedErrorMessage="Login or E-mail not found";

        WebElement errorText=driver.findElement(By.cssSelector("div[class='errortext']"));
        String actualErrorText=errorText.getText();
        System.out.println("actualErrorText = " + actualErrorText);
        if (actualErrorText.equals(expectedErrorMessage)){
            System.out.println("Error text verification PASSED!");
        }else {
            System.out.println("Error text verification FAILED !!!");
        }

driver.close();
    }
}
