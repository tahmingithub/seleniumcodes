package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class actionClass2 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
       //we want to right click, before that we need to create object .
        Actions action= new Actions(driver);  // object
        action.contextClick(rightClick).perform(); //right click is also contextClick, (rightClick)=>parameter


    }
}


