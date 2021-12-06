package sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {

	public static void main(String[] args) throws IOException, Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		
		WebElement s = dr.findElement(By.id("email"));
		s.sendKeys("Jotheesw");
		
		WebElement s1 = dr.findElement(By.name("pass"));
		s1.sendKeys("456789321");
		
		WebElement s2 = dr.findElement(By.name("login"));
	    s2.click();
		
	    Thread.sleep(4000);
		TakesScreenshot ss=(TakesScreenshot)dr;
		File u = ss.getScreenshotAs(OutputType.FILE);
		File v=new File("C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\screenshot\\img.png");
		FileUtils.copyFile(u, v);
	
}
}
