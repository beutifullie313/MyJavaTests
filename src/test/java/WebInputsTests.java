//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class WebInputsTests {
//
//    //https://practice.expandtesting.com/inputs
//
//    @Test
//    public void testInputFormoNumberPsitive(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://practice.expandtesting.com/inputs");
//
//        String inputValue = "220";
//
//        WebElement inputNumber = driver.findElement(By.id("input-number"));
//        inputNumber. sendKeys(inputValue);
//
//        WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
//        displayInputsButton.click();//passed

        //after clicking the button
//
//        WebElement outputNumber = driver.findElement(By.id("output-number"));
//        String outputValue = outputNumber.getText();
//        Assert.assertEquals(outputValue,inputValue);
//
////        public void testInputFormNumberNegative(){
////            WebDriver driver = new ChromeDriver();
////            driver.get("https://practice.expandtesting.com/inputs");
////
////            String inputValues = "-220";
////            WebElement inputNegativeNumber = driver.findElement(By.id("input-number"));
////            inputNegativeNumber. sendKeys(inputValues);
////
////            WebElement displayInputButton = driver.findElement(By.id("btn-display-inputs"));
////            displayInputButton.click();
//////
//////            //after clicking the button
//////
////            WebElement outputNumber = driver.findElement(By.id("output-number"));
////            String outputValue = outputNumber.getText();
////            Assert.assertEquals(outputValue,inputValues);//passed
//
//
//
////    public void testInputFormNumberIsAlphaAllowed(){
////            WebDriver driver = new ChromeDriver();
////            driver.get("https://practice.expandtesting.com/inputs");
////
////            String inputValue= "abcde";
////
////            WebElement inputNegativeNumber = driver.findElement(By.id("input-number"));
////            inputNegativeNumber. sendKeys(inputValue);
////
////            WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
////            displayInputsButton.click(); //fail
////
//////            //after clicking the button
////
////            WebElement outputNumber = driver.findElement(By.id("output-number"));
////            String outputValue = outputNumber.getText();
////            Assert.assertEquals(outputValue,inputValue);
//
//
//    // it's a bug, how to check the field frame length?????????????????????????????????????????????????????????????????????????????????????????????????
//
//        public void testInputFormNumberLarge(){
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://practice.expandtesting.com/inputs");
//
//            String inputValue= "1000000000000000000000000000000000000000000000";
//
//            WebElement inputLargeNumber = driver.findElement(By.id("input-number"));
//            inputLargeNumber. sendKeys(inputValue);
//
//        int inputNumberFieldWidth = inputLargeNumber.getSize().getWidth();
//
//            WebElement displayInputsButton = driver.findElement(By.id("btn-display-inputs"));
//            displayInputsButton.click();
//
////            after clicking the button
//
//            WebElement outputNumber = driver.findElement(By.id("output-number"));
//            String outputValue = outputNumber.getText();
//        // Retrieve the length of the displayed value
//        int displayedValueLength = outputValue.length();
//            Assert.assertEquals(outputValue,inputValue);
//        // Assert that the displayed value is within the width of the input field
//        Assert.assertTrue(displayedValueLength <= inputNumberFieldWidth, "The large number fits within the input field");
//
////
////        driver.quit();
//
//
//
//        // NEXT FIELDS
//
////        WebElement inputText = driver.findElement(By.id("input-text"));
////        inputLargeNumber. sendKeys("Hello");
////
////        WebElement inputPassword = driver.findElement(By.id("input-password"));
////
////
////        WebElement inputDate = driver.findElement(By.id("input-date"));
////        inputLargeNumber. sendKeys("03/19/2024");
//
//
//
//
//
//
//
////        WebElement outputText = driver.findElement(By.id("output-text"));
////        inputText. sendKeys("Hello");
////
////        WebElement outputPassword = driver.findElement(By.id("output-password"));
////        inputPassword. sendKeys("12345678");
////
////        WebElement outputDate = driver.findElement(By.id("output-date"));
////        inputDate. sendKeys("03/19/2024");
//
//
//
//
//    }
//}
