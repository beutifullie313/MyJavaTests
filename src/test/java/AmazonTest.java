import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class AmazonTest {


    @Test
            public void testAmazonSearchIsVisible() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.walmart.com/?&gclsrc=aw.ds&adid=22222222220220085369&wmlspartner=wmtlabs&wl0=e&wl1=g&wl2=c&wl3=521205638070&wl4=kwd-27665750&wl5=9060248&wl6=&wl7=&wl8=&veh=sem&gad_source=1&gclid=CjwKCAjwuJ2xBhA3EiwAMVjkVGucFzVU_STT6pADNMN-QzSG8HA5uLxg-HKZjBQuqsZ9Ti2F14XoxxoCvlgQAvD_BwE");
        WebElement searchBar = driver.findElement(By.cssSelector("#__next > div:nth-child(1) > div > span > header > form > div > input"));
        Assert.assertTrue(searchBar.isDisplayed(), "Search bar is not displayed");
    }

    @Test

            public void testAmazonSearchValidQuery(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.walmart.com/?&gclsrc=aw.ds&adid=22222222220220085369&wmlspartner=wmtlabs&wl0=e&wl1=g&wl2=c&wl3=521205638070&wl4=kwd-27665750&wl5=9060248&wl6=&wl7=&wl8=&veh=sem&gad_source=1&gclid=CjwKCAjwuJ2xBhA3EiwAMVjkVGucFzVU_STT6pADNMN-QzSG8HA5uLxg-HKZjBQuqsZ9Ti2F14XoxxoCvlgQAvD_BwE");

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement searchbar = driver.findElement(By.cssSelector("#__next > div:nth-child(1) > div > span > header > form > div > input"));
        //waiter.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#__next > div:nth-child(1) > div > span > header > form > div > input"))));
        searchbar.sendKeys("iPhone, 13");
        WebElement searchButton = driver.findElement(By.cssSelector("#__next > div:nth-child(1) > div > span > header > form > div > button.absolute.bn.br-100.hover-bg-navy.search-icon"));
        //WebDriverWait waiter = new WebDriverWait(driver,2000)
                //.until(ExpectedConditions.attributeToBeNotEmpty(searchbar));
                searchButton.click();

                String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains(searchbar.getText()), "Search results page title does not contain the search query");
        }








    }

