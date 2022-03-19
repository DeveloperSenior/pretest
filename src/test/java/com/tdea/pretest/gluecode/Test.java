package com.tdea.pretest.gluecode;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;
    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");

    }

    @Given("testGiven")
    public void test_given() {
        setUp();
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException()
    }

    @When("testWhen")
    public void test_when() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement user = this.driver.findElement(By.id("username"));
        user.clear();
        user.sendKeys("andres");
        WebElement pass = this.driver.findElement(By.id("password"));
        pass.clear();
        pass.sendKeys("123");
    }

    @Then("testThen")
    public void test_then() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        WebElement login = this.driver.findElement(By.xpath("//button[text()='Login']"));
        login.submit();
    }
}
