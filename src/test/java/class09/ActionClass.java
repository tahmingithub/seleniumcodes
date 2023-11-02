package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action=new Actions(driver);  //create object
        action.moveToElement(hover).perform(); // action=.object moveToElement=> method

//        draggable
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

//        droplocation
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

       // action.dragAndDrop(draggable,dropLocation).perform(); // (draggable , drolocation ) is element inside paremeter and wae write perform

// if it is 3 method we should write  build , we say these are the 3 method build and perform it
        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform(); //
        //clickAndHold,moveToElement, release are 3 methods


    }
}

