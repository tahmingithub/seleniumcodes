package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;  //  instance
    public static void openBrowserAndLaunchApplication(String url,String browser){    //method
       // instance
        switch(browser){   // switch case
            case "chrome":
                driver=new ChromeDriver(); // initialized , declare chrome driver
                break;
            case"firefox":
                driver=new FirefoxDriver();
                break;
        }
        driver.get(url);  //  url=>  any website like facebook, google
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicit wait is global wait
        //by using implicit wait , you dont wast time.
    }

    public static void closeBrowser(){       // method

    if(driver!=null){   //if element is initialized
        driver.quit();
    }

}
    public  static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
    public static WebDriverWait getWait(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        return wait;
    }
    public  static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }


    public void click(WebElement element){
        waitForClickability(element);
        element.click();
    }
    public static void jsClick(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
    public static void takeScreenShot(String filename) throws IOException {   //method
        //declare the instance
        TakesScreenshot ts=(TakesScreenshot) driver;
        //take screenshot
        File ss= ts.getScreenshotAs(OutputType.FILE);
        //save on computer
        FileUtils.copyFile(ss,new File(System.getProperty("user.dir")+"\\screenshot\\"+filename+".png"));

    }

}
