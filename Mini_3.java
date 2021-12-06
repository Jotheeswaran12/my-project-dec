package sele;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Mini_3 {
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
			
			WebDriver s=new ChromeDriver();
			
		 	s.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7");
		 	
		 WebElement j = s.findElement(By.xpath("//a[text()='Mobiles']"));
		 j.click();
		 Actions p=new Actions(s);
		 
		 WebElement f = s.findElement(By.xpath("//span[text()='Mobile Accessories']"));
		 p.contextClick(f).perform();
		 
		//WebElement k = s.findElement(By.xpath("a[@target='_blank']"));
		//k.click();

		 
		
		
		 
	}

}
