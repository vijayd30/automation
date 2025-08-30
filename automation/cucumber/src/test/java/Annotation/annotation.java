package Annotation;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class annotation {
    WebDriver driver = null;
    @When("I enter username as {string}")
    public void gotoYahoo (String name) {
        driver = new ChromeDriver();
        driver.get("https://login.yahoo.com");
        WebElement we = driver.findElement(By.name("username"));
        we.sendKeys(name);
        System.out.println(name);
    }

    @When("I enter password as {string}")
    public void enterPassword(String password) {
        WebElement we = driver.findElement(By.name("signin"));
        we.click();
    }
    @Then("Login should fail")
    public void errorMessage() {

    }
}
