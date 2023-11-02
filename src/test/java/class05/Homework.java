package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        //Homework class 5
        // select your dream destination from this calendar

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);



       WebElement dreamDestination = driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
       dreamDestination.click();


        WebElement country=driver.findElement(By.linkText("Greece"));
       country.click();


    }

}
