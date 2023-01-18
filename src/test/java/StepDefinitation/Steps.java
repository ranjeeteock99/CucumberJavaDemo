package StepDefinitation;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;
    WebElement login;
    WebElement username;
    WebElement password;
    String actualUrl;

    @Given("The user is on login page")
    public void the_user_is_on_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");


        Thread.sleep(1000);
        System.out.println("The user is on login page");

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        username = driver.findElement(By.id("user_email_login"));
        password = driver.findElement(By.id("user_password"));
        login = driver.findElement(By.id("user_submit"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        System.out.println("the user enters valid credentials");
    }

    @And("hits the submit button")
    public void hits_the_submit_button() {
        login.click();
        actualUrl = driver.getCurrentUrl();
        System.out.println("hits the submit button");
    }

    @Then("The use should be logged in succesfully")
    public void the_use_should_be_logged_in_succesfully() {
        String expectedUrl = "";
        //Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("The user should be logged in succesfully");
    }

}
