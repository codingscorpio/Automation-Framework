package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

  public class GoogleHomePage
   {
    @FindBy (xpath="//textarea[@title=\"Search\"]") private WebElement searchBox;
    @FindBy (xpath="(//input[@value=\"Google Search\"])[1]") private WebElement searchButton;

   public GoogleHomePage(WebDriver driver)
    {
     PageFactory.initElements(driver, this);
    }
   public void enterToSearch(String typeSomething)
    {
     searchBox.sendKeys(typeSomething);
    }
   public void clickOnSearchButton()
    {
     searchButton.click();
    }
   }