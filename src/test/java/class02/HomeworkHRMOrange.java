package class02;

import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkHRMOrange {
    public static void main(String[] args) throws InterruptedException {

      WebDriver driver= new ChromeDriver();
      //maximize the page
      driver.manage().window().maximize();
      //open the OrangeHrm login page
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      // sleep time to 3 sec
      Thread.sleep(3000);
      //enter the username as "abc"
        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("abc");
        username.clear();
        // //enter the username as "admin"
        username.sendKeys("Admin");
        // enter the pass as admin123
        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("admin123");
        //get text from login button
        WebElement login= driver.findElement(By.tagName("button"));
        String text= login.getText();
        //print it on the console
        System.out.println(text);
        //click login
        login.click();
        //quit the whole browser
        driver.quit();







    }
}
