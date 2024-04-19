//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.json.JsonOutput;
//import org.testng.Assert;
//import org.testng.AssertJUnit;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;
//
///**
// * @author Eugene Petrov
// */
//public class BasketTest {
//    static String url = "https://topswagcode.com/xpath/";
//    @Test
//
//    public static void main(String[] args) throws InterruptedException {
//
//        public void tesStart() throws Exception{
//            WebDriver driver = new ChromeDriver();
//            driver.get(url);
//            driver.manage().window().maximize();
//            WebElement textField = driver.findElement(By.xpath(//input[@placeholder='Type in a Xpath selector']));
//            textField.sendKeys("//plate");
//            Thread.sleep(1000);
//            try{
//                Assert.assertEquals(driver.findElement(By.xpath("//span[@class='level-text']")).getText(), "Level 3 of 26");
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//
//            } finally {
//                driver.quit();
//            }
//
//            textField.submit();
//
//            @AfterTest //after each test
//                    public void quit(){
//                driver.quit();
//            }
//
//
//
//
//
//
//
//            WebElement enterButton = driver.findElement(By.className("enter-button enterhit"));
//            enterButton.click();
//
//            Thread.sleep(2000);
//            driver.quit();
//
//
//        }
//    }
//}
