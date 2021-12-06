package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_ji {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver s=new ChromeDriver();
	
	s.get("http://demo.automationtesting.in/Frames.html");
	WebElement l = s.findElement(By.xpath("//a[contains(text(),'with')]"));	
	l.click();
	int h = s.findElements(By.tagName("iframe")).size();
	System.out.println(h);
	
	s.switchTo().frame(1);
	
	WebElement k = s.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	s.switchTo().frame(k);
	
	Thread.sleep(5000);
	WebElement i = s.findElement(By.xpath("//input[@type='text']"));
	i.sendKeys("tester");
	
	
	
	
}

}
