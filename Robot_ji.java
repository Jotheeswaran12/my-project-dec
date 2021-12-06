package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_ji {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver s=new ChromeDriver();
	
 	s.get("https://www.amazon.in/");	
	WebElement i = s.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions g=new Actions(s);
	g.contextClick(i).build().perform();
	
	Robot k=new Robot();
	k.keyPress(KeyEvent.VK_DOWN);
	k.keyRelease(KeyEvent.VK_DOWN);
	
	k.keyPress(KeyEvent.VK_DOWN);
	k.keyRelease(KeyEvent.VK_DOWN);
	
	k.keyPress(KeyEvent.VK_ENTER);
	k.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
}
}
