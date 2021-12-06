package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver s=new ChromeDriver();
	
 	s.get("http://www.greenstechnologys.com/");	
 	WebElement y = s.findElement(By.xpath("//a[text()='CONTACT US']"));
	Actions f=new Actions(s);
	f.contextClick(y).build().perform();
	Robot k=new Robot();
	k.keyPress(KeyEvent.VK_DOWN);
	k.keyRelease(KeyEvent.VK_DOWN);
	k.keyPress(KeyEvent.VK_ENTER);
	k.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement g = s.findElement(By.xpath("//a[text()='COURSES']"));
	g.click();
	s.findElement(By.xpath("//img[@alt='Oracle DBA Icon']")).click();
	
	TakesScreenshot ss=(TakesScreenshot)s;
	File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
	File v=new File("C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\screenshot\\img.png");
	FileUtils.copyFile(screenshotAs, v);
	
}
}
