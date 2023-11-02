package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
//        get all the links and print them on the console.

        List<WebElement> links = driver.findElements(By.tagName("a"));  // return us a list of web element

        for(WebElement link:links){   // loop

           // String nameOflink = link.getText(); // goal is to get all element from the web.
            //System.out.println(nameOflink);
            String linkVal = link.getAttribute("href"); // we want to get all the links.
            System.out.println(linkVal);
        }
    }
}


