package bootstrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

/**
 * Created by cheeras on 11/27/17.
 */
public class BootStrapDropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cheeras/Desktop/Selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
            driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
        System.out.println("Title is "+driver.getTitle());

        driver.findElement(By.xpath("//*[@id='menu1']")).click();

       List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

       /*for(int i=0;i<dd_menu.size();i++){
          WebElement element = dd_menu.get(i);
          String innerHTML =  element.getAttribute("innerHTML");
          if(innerHTML.contentEquals("JavaScript")){
              element.click();
              break;
          }
       }*/

       for (WebElement element : dd_menu){
           String innerHTML = element.getAttribute("innerHTML");
           if(innerHTML.contentEquals("JavaScript")){
               element.click();
               break;
           }
       }

       driver.quit();


    }
}
