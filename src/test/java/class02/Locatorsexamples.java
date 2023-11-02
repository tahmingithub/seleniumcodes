package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsexamples {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("txtUsername"));

        Thread.sleep(2000);
        userName.clear();
        userName.sendKeys("admin");
//        to send the password
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");

//         click on the login button
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();
//   get the text welcome admin and print on the console

        WebElement welcomeMsg = driver.findElement(By.linkText("Welcome Admin"));
        String msg = welcomeMsg.getText();
        System.out.println("the message is:"+msg);
    }
}



