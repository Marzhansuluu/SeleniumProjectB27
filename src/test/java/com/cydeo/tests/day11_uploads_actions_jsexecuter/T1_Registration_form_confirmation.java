package com.cydeo.tests.day11_uploads_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_form_confirmation {

    @Test
    public void registration_form_test(){

//        1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form

        // I can call my driver with 2 ways. Look at the following
        //#1-
        // Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        //#2-
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));


        // Create JavFaker object
        Faker faker = new Faker();


//3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());


//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

//5. Enter username
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //username.sendKeys(faker.name().username().replaceAll(".", ""));
        String user = "faker.bothify(\"helpdesk####\")";// I stored the user in that way I can reuse in the email.
        username.sendKeys(faker.bothify("????####???###"));

//6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());// I got user from String user variable.


//7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

//8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));


//9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

//10. Enter date of birth
        WebElement DOB = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        DOB.sendKeys("03/08/2000");


//11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

//12. Select Job Title
WebElement jobTitle = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']/option[5]"));
jobTitle.click();


//13. Select programming language from checkboxes
        WebElement language = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        language.click();
//14. Click to sign up button

        WebElement signUpBtn = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUpBtn.click();

//15. Verify success message “You’ve successfully completed registration.” is
//displayed.

        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']/p"));
        String actualMessage = message.getText();
        String expectedMessage = "You’ve successfully completed registration!";

        Assert.assertEquals(actualMessage, expectedMessage);
        //BrowserUtils.verifyTitle(driver, );
//
//
//Note:
//1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense


    }

}
