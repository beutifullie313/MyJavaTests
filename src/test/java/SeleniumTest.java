import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class SeleniumTest {
@Test
    public void testTest(){
        WebDriver driver = new ChromeDriver(); //WebDriver is an interface
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");//.get go to the page

//        String title = driver.getTitle();// check tab name- no need to test this, as we won't find elements on wrong page
//        Assert.assertEquals("Web form", title);
//
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500)); //to stabilize the test

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        WebElement passwordBox = driver.findElement(By.name("my-password"));
        passwordBox.sendKeys("Yulya");

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        Assert.assertEquals("Received!", value);

        driver.quit();
    }

    @Test

    public void testGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //WebDriver is an interface
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Selenium");
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();

        WebElement result = driver.findElement(By.xpath("//a[@href = 'https://www.selenium.dev/']h3"));
        String text = result.getText();

        Assert.assertEquals(text,"Selenium");
        driver.quit();
    }
}

