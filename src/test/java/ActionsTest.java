import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest {
    private WebDriver driver;
    private Actions actions;
    private Actions getActions() {
        if(actions == null) {
            actions = new Actions (driver);
        }
        return actions;
    }
    private WebDriver getDriver(){
        if(driver ==null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    @Test
    public void testMouseActions() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement slider = driver.findElement(By.className("form-range"));
        //Thread.sleep(5000);
        slider.sendKeys(Keys.LEFT,Keys.LEFT, Keys.LEFT,Keys.LEFT);
        Assert.assertEquals("1", slider.getAttribute("value"));
        //Thread.sleep(5000);
        driver.quit();

    }
    @Test
    public void testSliderAction() throws Exception{
        WebDriver driver = getDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement slider = driver.findElement(By.className("form-range"));
        //Thread.sleep(2000);
        getActions().clickAndHold(slider)
                .moveByOffset(0,0)
                .release()
                .perform();

        //Assert.assertEquals(5,slider.getAttribute("value"));
        driver.quit();
    }

    @Test
    public void testSliderClick() throws Exception{
        WebDriver driver = getDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement slider = driver.findElement(By.xpath("//input[@name ='my-range']"));
        final Dimension size = slider.getSize();
        int sliderWidth = size.getWidth();
        getActions().moveToElement(slider)
                .moveByOffset(sliderWidth *2/5, 0)
                .click()
                .perform();
        driver.quit();

    }
}
