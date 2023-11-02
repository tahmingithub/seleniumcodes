package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
    /*
    Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.
     */

        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php.");
        WebElement femaleRadioButton =driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean statusfemaleradiobtn=femaleRadioButton.isDisplayed();
        if(statusfemaleradiobtn){
            System.out.println("displayed");
        }else{
            System.out.println("not displayed");
        }
        WebElement showbutton=driver.findElement(By.cssSelector("button#toggleRadioButtons"));
        showbutton.click();
        Thread.sleep(3000);
        boolean femaleradiobtnsecond=femaleRadioButton.isDisplayed();
        if(femaleradiobtnsecond){
            System.out.println("displayed");
        }else{
            System.out.println("not displayed");
        }


    }
}

