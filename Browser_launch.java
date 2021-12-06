package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Browser_launch {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
		
		WebDriver s=new ChromeDriver();
		
		s.get("https://www.facebook.com/");
			
		WebElement r = s.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		r.click();
		Thread.sleep(2000);
		
		WebElement e = s.findElement(By.name("firstname"));
		e.sendKeys("jothees");
		
		s.findElement(By.name("lastname")).sendKeys("waran");
		
		WebElement y = s.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		y.sendKeys("jotheeswaran@gmail.com");

		WebElement k = s.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		k.sendKeys("jotheeswaran@gmail.com");
		
		WebElement u = s.findElement(By.xpath("//input[@data-type='password']"));
		u.sendKeys("7755443");
		
	    s.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
	    
	    WebElement w = s.findElement(By.id("day")); 
	    Select s1=new Select(w);
		s1.selectByValue("26");
		
		WebElement w1 = s.findElement(By.id("month"));
		Select w2=new Select(w1);
		w2.selectByValue("12");
		
		WebElement w3 = s.findElement(By.id("year"));
		Select g=new Select(w3);
		g.selectByIndex(12);
		
		WebElement t = s.findElement(By.xpath("//button[@name='websubmit']"));
		t.click();
		
		
		
	}

}