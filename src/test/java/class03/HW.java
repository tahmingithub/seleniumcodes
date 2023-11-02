package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        // open chromeDriver
        WebDriver driver= new ChromeDriver();
        // maximize chromedriver
        driver.manage().window().maximize();
        // get to this website
        driver.get("https://demoqa.com/text-box");
        // find name and send keys
        WebElement fullname=driver.findElement(By.xpath("//input[@id='userName']"));
        fullname.sendKeys("student");
        // find email and send keys
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("student@gmail.com");
        // find address and send keys
        WebElement address= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        address.sendKeys("USA");
        // permanant address
        WebElement permanantAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanantAddress.sendKeys("Dubai");
        Thread.sleep(3000);
        //WebElement findbutton= driver.findElement(By.xpath("//button[text()='Submit']"));
       // findbutton.click();
        // find submit button and click
        WebElement submitbutton=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitbutton.click();







    }
}