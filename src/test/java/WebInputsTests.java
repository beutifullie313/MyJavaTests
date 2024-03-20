import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebInputsTests {

    //https://practice.expandtesting.com/inputs

    @Test
    public void testInputFormsPositive(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/inputs");

        String inputValue = "220";

        WebElement inputNumber = driver.findElement(By.id("input-number"));
        inputNumber. sendKeys(inputValue);

        WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
        displayInputsButton.click();

        //after clicking the button

        WebElement outputNumber = driver.findElement(By.id("output-number"));
        String outputValue = outputNumber.getText();
        Assert.assertEquals(outputValue,inputValue);

//        public void testInputFormsNegative(){
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://practice.expandtesting.com/inputs");
//
//            String inputValue = "-220";
//
//            WebElement inputNumber = driver.findElement(By.id("input-number"));
//            inputNumber. sendKeys(inputValue);
//
//            WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
//            displayInputsButton.click();
//
//            //after clicking the button
//
//            WebElement outputNumber = driver.findElement(By.id("output-number"));
//            String outputValue = outputNumber.getText();
//            Assert.assertEquals(outputValue,inputValue);



    // how to test that alpha is not allowed ???????????????????????????????????????????????????????????????????????????????????????????????


//    public void testInputFormsIsAlphaAllowed(){
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://practice.expandtesting.com/inputs");
//
//            String inputValue= "abcde";
//
//            WebElement inputNumber = driver.findElement(By.id("input-number"));
//            inputNumber. sendKeys(inputValue);
//
//            WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
//            displayInputsButton.click();
//
////            //after clicking the button
////
//            WebElement outputNumber = driver.findElement(By.id("output-number"));
//            String outputValue = outputNumber.getText();
//            Assert.assertEquals(outputValue,inputValue);


    // it's bug, how to check field length?????????????????????????????????????????????????????????????????????????????????????????????????

//        public void testInputFormsMaxNumber(){
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://practice.expandtesting.com/inputs");
//
//
//
//            String inputValue= "1000000000000000000000000000000000000000000000";
//
//            WebElement inputNumber = driver.findElement(By.id("input-number"));
//            inputNumber. sendKeys(inputValue);
//
//        int inputNumberFieldWidth = inputNumber.getSize().getWidth();
//
//            WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
//            displayInputsButton.click();

            //after clicking the button


//
//            WebElement outputNumber = driver.findElement(By.id("output-number"));
//            String outputValue = outputNumber.getText();
//        // Retrieve the length of the displayed value
//        int displayedValueLength = outputValue.length();
//            Assert.assertEquals(outputValue,inputValue);
//        // Assert that the displayed value is within the width of the input field
//        Assert.assertTrue(displayedValueLength <= inputNumberFieldWidth, "The large number fits within the input field");


//        driver.quit();



        // NEXT FIELDS 

//        WebElement inputText = driver.findElement(By.id("input-text"));
//        inputNumber. sendKeys("Hello");
//
//        WebElement inputPassword = driver.findElement(By.id("input-password"));
//
//
//        WebElement inputDate = driver.findElement(By.id("input-date"));
//        inputNumber. sendKeys("03/19/2024");







//        WebElement outputText = driver.findElement(By.id("output-text"));
//        inputNumber. sendKeys("Hello");
//
//        WebElement outputPassword = driver.findElement(By.id("output-password"));
//        inputNumber. sendKeys("12345678");
//
//        WebElement outputDate = driver.findElement(By.id("output-date"));
//        inputNumber. sendKeys("03/19/2024");




    }
}
