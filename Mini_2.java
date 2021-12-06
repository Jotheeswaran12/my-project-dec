package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_2 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver s=new ChromeDriver();
	
 	s.get("https://demoqa.com/automation-practice-form");
 	
 	WebElement r = s.findElement(By.id("firstName"));
	r.sendKeys("jothees");
	
	WebElement r1 = s.findElement(By.id("lastName"));
	r1.sendKeys("waran");
	
	WebElement r2 = s.findElement(By.id("userEmail"));
	r2.sendKeys("jothees@gmail.com");
	
    WebElement r3 = s.findElement(By.xpath("//label[text()='Male']"));
	r3.click();
	
	WebElement r4 = s.findElement(By.id("userNumber"));
	r4.sendKeys("98776554432");
	
	WebElement r5 = s.findElement(By.id("dateOfBirthInput"));
	r5.sendKeys("15nov2012");
	
	WebElement r6 = s.findElement(By.id("subjectsInput"));
	r6.sendKeys("demoqa");
	
	WebElement r7 = s.findElement(By.xpath("//label[text()='Sports']"));
	r7.click();
	
	//WebElement r8 = s.findElement(By.id("uploadPicture"));
    
	
	WebElement r9 = s.findElement(By.id("currentAddress"));
	r9.sendKeys("no:21,gandhi nagar,anna nagar west,chennai");
	
	Thread.sleep(3000);
   WebElement e = s.findElement(By.xpath("//button[text()='Submit']"));
   e.click();
	
	
}
}
