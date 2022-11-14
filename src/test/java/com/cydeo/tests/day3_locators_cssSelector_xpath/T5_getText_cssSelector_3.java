package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_cssSelector_3 {
    public static void main(String[] args) {
        //5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Enter incorrect username into login box:
        WebElement incorrectUsername = driver.findElement(By.name("USER_LOGIN"));
        incorrectUsername.sendKeys("incorrect"+ Keys.ENTER);

        //4- Click to `Reset password` button
        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPassword.click();

        //5- Verify “error” label is as expected
//        Expected: Login or E-mail not found
        WebElement errorText = driver.findElement(By.className("errortext"));
        String expectedText = "Login or E-mail not found";
        String actualText = errorText.getText();

        if(expectedText.equals(actualText)) {
            System.out.println("Error message verification passed!");
        } else {
            System.out.println("Error message verification failed!");
        }
        driver.quit();

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
