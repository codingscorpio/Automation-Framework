package utility;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;

  public class ToTakeScreenShot
   {
    public static String date()
     {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
      LocalDateTime currentTime = LocalDateTime.now();
      String d = dtf.format(currentTime);
      return d;
     }
    public static File takeScreenshot(WebDriver driver, String name) throws IOException
     {
      String d = ToTakeScreenShot.date();
      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File destination = new File("path" + name + d + ".png");
      FileHandler.copy(source, destination);
      return destination;
     }
   }