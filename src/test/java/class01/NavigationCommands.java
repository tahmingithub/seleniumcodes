package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {


        public static void main(String[] args) throws InterruptedException {

            WebDriver driver= new ChromeDriver();  //
            // go to google.com
            driver.get("https://www.google.com");     //  you cant go back or forward in history, it waite for whole page to load
            // max the window
            driver.manage().window().maximize();  // driver
            // slow down  to observe the process
            Thread.sleep(2000);
            // got to facebook.com
            driver.navigate().to("https://www.facebook.com"); // you can go back and forward and also refresh, it
            // doesnt wait for the whole page to load            //
            // slow to observe
            Thread.sleep(2000);
            // go back
            driver.navigate().back(); // back to google
            // slow to observe
            Thread.sleep(2000);
            // go forward
            driver.navigate().forward(); // forward to facebook

            // slow to observe
            Thread.sleep(2000);   //sleep
            driver.navigate().refresh();   // refresh
            // close
            driver.close();  // close the current page
            // also
            driver.quit(); // close the whole browser , means it close all the tab was open
        }
    }

