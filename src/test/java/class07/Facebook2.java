package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class Facebook2 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.facebook.com/";   // dynamic means it change
        String browser="chrome";
       openBrowserAndLaunchApplication(url,browser);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // global we dont need  in here , we have it in commonMethod
        //       find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

//        fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");



    }
}



