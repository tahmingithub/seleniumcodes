package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        /* Navigate to http://35.175.58.98/basic-checkbox-demo.php.  Check the if Checkbox1 is enabled. If Checkbox1 is
         disabled:
 Click on the "enable checkboxes" button.  Verify that Checkbox1 is now enabled. Click on Checkbox1.Confirm that
 Checkbox1 is selected.
        */
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");
        driver.manage().window().maximize();
        WebElement checkBox1=driver.findElement(By.xpath("//input[ @value='Checkbox-1']"));

        boolean checkstatusb1= checkBox1.isEnabled();
        if(checkstatusb1){
            System.out.println("checkbox1 is enabled");
        }else{
            System.out.println("checkbox1 is disabled");
        }
       WebElement enablecheckBoxesbtnstatus=driver.findElement(By.cssSelector("button#enabledcheckbox"));
        enablecheckBoxesbtnstatus.click();
        boolean checkstatusb1again =enablecheckBoxesbtnstatus.isEnabled();
        if(checkstatusb1again){
            System.out.println("checkbox 1 is enabled");
        }else{
            System.out.println("checkbox 1 is diabled");

        }
        checkBox1.click();
        boolean checkb1selected =checkBox1.isSelected();
        if(checkb1selected){
            System.out.println("checkbox 1 is selected");
        }else{
        System.out.println("checkbox1 is not selected");
    }




    }
}
