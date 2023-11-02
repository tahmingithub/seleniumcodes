package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class DynamicTableWithPagination1 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewEmployeeList/reset/1";   // dynamic means it change
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //        find the username
        WebElement usrName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usrName.sendKeys("Admin");
//        find the password
        WebElement paswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        paswrd.sendKeys("Hum@nhrm123");

//        find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement PIM = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIM.click();//
        //       ------------ tables    task---------------------
//select the check box for  the employee that has an id of  357842

        boolean notfound=true;  //we have boolean cuz we can run the while loop, until the condition is false.
        //continue  to execute the while loop until not found =false.
        while(notfound){  // while loop first check the condition
            //        get the column id in the list
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));//page one

//        iterate
            for (int i = 0; i < idColumn.size(); i++) {

                String id = idColumn.get(i).getText();
//            compare if that is my desired id
                if (id.equals("61061921")) {
//                click on the checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    notfound=false;
                    break;    // the loop still going ,so we need to stop the loop once it found the desired id
                }
            }
            if(notfound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']")); // click on next page
                nextBtn.click();
            }


        }

        }
//when it click on  next page,  it goes again through the loop , the not found become false (meaning it found the desired )
    // then  we see break since it found the desired id.  the if not found, line #48 does not run to the next page
    //because in second page already found the desired id.











    }

