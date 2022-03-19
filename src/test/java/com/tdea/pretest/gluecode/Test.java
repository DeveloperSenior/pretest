package com.tdea.pretest.gluecode;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {

    private WebDriver driver;
    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");

    }

    @Given("User name {string} and password {string}")
    public void test_given(String user,String pass) {
        setUp();
        WebElement userTag = this.driver.findElement(By.id("username"));
        userTag.clear();
        userTag.sendKeys(user);
        WebElement passTag = this.driver.findElement(By.id("password"));
        passTag.clear();
        passTag.sendKeys(pass);
    }

    @When("Use button {string} and response is {string}")
    public void test_when(String button,String response)throws InterruptedException {
        WebElement loginButton = this.driver.findElement(By.xpath("/html/body/div/div/button["+("Login".equals(button)? 1 : 2)+"]"));
        loginButton.click();
        Thread.sleep(1000);
        WebElement responseTag = this.driver.findElement(By.xpath("/html/body/div/div/div[1]"));
        Assertions.assertEquals(response,responseTag.getText());
    }

    @Then("Use button {string}")
    public void test_then(String button) throws InterruptedException {
        WebElement actionButton = this.driver.findElement(By.xpath("/html/body/div/div/button["+("Login".equals(button)? 1 : 2)+"]"));
        actionButton.click();
    }
}
