package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class screenshot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);   //path, screenshot of folder, name of screenshot

//        declare the isntance
        TakesScreenshot ts=(TakesScreenshot) driver;

//        take screen shot
        File ss = ts.getScreenshotAs(OutputType.FILE);

//        then save on computer
        FileUtils.copyFile(ss,new File("/Users/tahmin/eclipse-workspace/syntaxSdetBatch16Basic/screenshot/abc.png"));
     // screenshot is folder name, new file we create  new file, abc.png is name of screenshot
    }
}





