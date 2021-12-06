package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
		
		WebDriver s=new ChromeDriver();
		
	 	s.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	 	
	 	s.switchTo().frame(0);
	 	WebElement h = s.findElement(By.xpath("//a[text()='CONTINUE']"));
	 	h.click();
	 	Thread.sleep(3000);
	 	s.switchTo().alert().accept();
	 	
	 	
	}

}
