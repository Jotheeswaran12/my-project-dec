package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_hand {
public static void main(String[] args) throws Throwable {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver s=new ChromeDriver();
	
 	s.get("https://www.amazon.in/");	
	WebElement i = s.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions j=new Actions(s);
	j.contextClick(i).build().perform();
	
	Robot d=new Robot();
	d.keyPress(KeyEvent.VK_DOWN);
	d.keyRelease(KeyEvent.VK_DOWN);
	d.keyPress(KeyEvent.VK_ENTER);
	d.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement k = s.findElement(By.xpath("//a[text()=' Electronics ']"));
	j.contextClick(k).build().perform();
	
	d.keyPress(KeyEvent.VK_DOWN);
	d.keyRelease(KeyEvent.VK_DOWN);
	d.keyPress(KeyEvent.VK_ENTER);
	d.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement l = s.findElement(By.xpath("//a[text()='Computers']"));
	j.contextClick(l).build().perform();
	
	d.keyPress(KeyEvent.VK_DOWN);
	d.keyRelease(KeyEvent.VK_DOWN);
	d.keyPress(KeyEvent.VK_ENTER);
	d.keyRelease(KeyEvent.VK_ENTER);
	
	String windowHandle = s.getWindowHandle();
	System.out.println(windowHandle );
	
	Set<String> windowHandles = s.getWindowHandles();
	for (String string : windowHandles) {
		String title = s.switchTo().window(string).getTitle();
	System.out.println(title);	
	}
	String u = "Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
    for (String string : windowHandles) {
		if (s.switchTo().window(string).getTitle().equals(u)) {
			System.out.println("process done");
			break;
		}
		
	}
}
}
