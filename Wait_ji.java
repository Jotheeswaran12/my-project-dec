package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_ji {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver s=new ChromeDriver();
	
 	s.get("https://www.facebook.com/");
 	s.findElement(By.id("email")).sendKeys("Jothees@gmail.com");
 	s.findElement(By.id("pass")).sendKeys("Jothess");
 	//s.findElement(By.name("login")).click();
 	WebElement o = s.findElement(By.xpath("//a[text()='Create New Account']"));
    o.click(); 	
    
    //s.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    
    WebElement findElement = s.findElement(By.name("lastname"));
    findElement.sendKeys("jothees");   
    
    WebDriverWait s1=new WebDriverWait(s,30);
   
    
}
}