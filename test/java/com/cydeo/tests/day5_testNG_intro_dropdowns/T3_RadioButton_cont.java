package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_RadioButton_cont {

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a List of Web Element
        clickAndVerifyRadioButton(driver,"sport","hockey");
        clickAndVerifyRadioButton(driver,"sport","football");
        clickAndVerifyRadioButton(driver,"color","yellow");





    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons =driver.findElements(By.name(nameAttribute));
        // Loop through the list of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId= each.getAttribute("id");

            if (eachId.equals(idValue)){

                each.click();
                System.out.println(eachId+" is Selected :"+ each.isSelected());
                break;
            }

        }


    }
}
