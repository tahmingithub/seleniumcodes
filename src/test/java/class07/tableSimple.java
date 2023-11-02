package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class tableSimple extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        get the whole table
//        ******************table level access*****************
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText(); // get the text from the table
//        System.out.println(tableContent);

//        ********** row level access**********************
//only print rows with software engineer in them as positon
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for(WebElement row:rows){                               // tr => row
            String text = row.getText();
            if(text.contains("Software Engineer")) {
//                System.out.println(text);
            }
        }
//        **************column level access*****************
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        for(WebElement column :columns){                      // td =>column
            String text = column.getText();
            System.out.println(text);
        }
        System.out.println("=============   =============   =============");
     //    ********************Task **********************************
//        ****************** print the row with position Software engineer without using contain method*******

//        locate the column that contains postion
        List<WebElement> colum = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
        int i=0;  // declare
//        iterate
        for(WebElement cl:colum){    // first we find column  that has software engineer
            String text = cl.getText();

            if(text.equals("Software Engineer")){

                System.out.println("the row that contains software engineer is"+i);
                //  second we find row
                WebElement row = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]"));
                System.out.println(row.getText());
            }
            i=i+1;
        }

    }
}
