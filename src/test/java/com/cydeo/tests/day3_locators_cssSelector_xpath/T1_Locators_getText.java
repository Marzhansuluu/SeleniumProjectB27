package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public static void main(String[] args) {
        //1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");// if we are planning to use again,
        //I just need to keep writing the same thing again and again. Thats why I will store inside of the WebElement
        WebElement inputUsername = driver.findElement(By.name("USER_LOGIN"));
        inputUsername.sendKeys("incorrect");


        //4- Enter incorrect password: “incorrect”
        //to store the webElement write first driver.findElement(By.name("")); then do opt+enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();



        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedMessage = "Incorrect login or password";
        String actualMessage = errorMessage.getText();

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Error message verification Passed");
        }else{
            System.out.println("Eroor message verification Failed");
        }

        driver.quit();

    }
}
