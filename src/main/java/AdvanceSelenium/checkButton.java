package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        WebElement chk1= driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement chk2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        
        if(chk1.isSelected())
        {
        	System.out.println("Check box is already selected");
        	Thread.sleep(5000);
        }
        
        
        else
        {
        	chk1.click();
        }
        
	}

}
