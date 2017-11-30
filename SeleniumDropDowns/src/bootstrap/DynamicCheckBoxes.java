package bootstrap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by cheeras on 11/29/17.
 */
public class DynamicCheckBoxes {
    public static void main(String args[]) throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/cheeras/Desktop/Selenium/drivers/chromedriver");

        WebDriver  driver = new ChromeDriver();

        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

        driver.manage().window().maximize();

        List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));

        //checking for Ruby radio button and click on it

        for(WebElement ele : radio){
            String value = ele.getAttribute("value");
            System.out.println("List of Radio boxes are====="+value);
            if(value.contentEquals("RUBY")){
                ele.click();
                break;
            }
        }

        Thread.sleep(5000);

        //checking for Coding check box and select it

        List<WebElement> checkbox  = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement ele:checkbox){

           String idvalue = ele.getAttribute("id");
           System.out.println("idValue is =====>>>>"+idvalue);
           if(idvalue.equalsIgnoreCase("code")){
               ele.click();
               break;
           }
        }


    }
}
