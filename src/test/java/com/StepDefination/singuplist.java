package com.StepDefination;

import com.driverclass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.UUID;

public class singuplist extends driverclass {
    @When("^I click on account button$")
    public void iClickOnAccountButton() {
     driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[2]/div/div[2]/ul/li[3]/div/a/i")).click();
        }
    @And("^I click on register here$")
    public void iClickOnRegisterHere() {
    driver.findElement(By.xpath("//*[@id=\"registeredStatus\"]/div/h4/a")).click();
    }

    @When("^I select title as \"([^\"]*)\"$")
    public void iSelectTitleAs(String title) throws Throwable {
        new Select(driver.findElement(By.id("title"))).selectByVisibleText("Mr");
    }

    @Given("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstname) throws Throwable {
        String s = RandomStringUtils.randomAlphabetic(8);
        System.out.println(s);
    driver.findElement(By.id("firstName")).sendKeys(s);
    }

    @And("^I enter surname as \"([^\"]*)\"$")
    public void iEnterSurnameAs(String surname) throws Throwable {
        driver.findElement(By.id("surname")).sendKeys("Jone");
    }

    @And("^I enter date of birth \"([^\"]*)\"$")
    public void iEnterDateOfBirth(String arg0) throws Throwable {
        new Select(driver.findElement(By.id("day"))).selectByValue("25");
        new Select(driver.findElement(By.id("month"))).selectByValue("March");
        new Select(driver.findElement(By.id("year"))).selectByValue("1990");
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email) throws Throwable {
        String uuemail = UUID.randomUUID().toString();
        System.out.println(uuemail);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div/div[2]/div[2]/form/div[6]/div/input")).sendKeys(uuemail+"@gmail.com"); }


    @And("^I enter Telephone as \"([^\"]*)\"$")
    public void iEnterTelephoneAs(String telno) throws Throwable {
        driver.findElement(By.id("telephone")).sendKeys("0123456789");
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        driver.findElement(By.id("newPassword")).sendKeys("password1!");
    }

    @And("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confpassword) throws Throwable {
        driver.findElement(By.id("confirmPassword")).sendKeys("password1!");
    }

    @When("^I click on Create Account button$")
    public void iClickOnCreateAccountButton() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div/div[2]/div[2]/form/div[12]/div[1]/div/button/span")).click();
    }
}
