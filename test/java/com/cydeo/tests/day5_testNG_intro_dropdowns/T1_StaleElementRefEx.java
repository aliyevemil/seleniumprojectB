package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //3. Click to “Add Element” button
        WebElement addElementBttn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(2000);

        addElementBttn.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //5. Click to “Delete” button.
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("---> StaleElementReferenceException exception is thrown");
            System.out.println("---> This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed = false");
        }
        driver.close();



    }
}