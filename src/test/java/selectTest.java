import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

public class selectTest {


        @Test
        public void testDropdown() throws Exception{
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.selenium.dev/selenium/web/selectPage.html");
            final WebElement selectWithoutMultiple =  driver.findElement(By.id("selectWithoutMultiple"));
            Select simpleDropdown = new Select(selectWithoutMultiple);
            simpleDropdown.selectByValue("two");

            String newValue = selectWithoutMultiple.getAttribute("value");//read the attribute of our element
            System.out.println(newValue);
            Assert.assertEquals("two",newValue);

            Thread.sleep(5000);

        }
        @Test
        public void testMultipleSelect() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.selenium.dev/selenium/web/selectPage.html");
            final WebElement selectMultiple = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
            Select multiSelect = new Select(selectMultiple);
            multiSelect.selectByIndex(2);
            multiSelect.selectByVisibleText("Cheddar");
            //multiSelect.deselectAll();

            System.out.println(selectMultiple.getAttribute("value"));//print the value of the element
            System.out.println(multiSelect.getAllSelectedOptions().stream().map(WebElement::getText).collect(Collectors.toList()));
            Thread.sleep(5000);
        }




    }
