
package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ToOpenChromeBrowser {
	 public static WebDriver openChrome(String url)
	   { 
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    return driver;
	   }

}
