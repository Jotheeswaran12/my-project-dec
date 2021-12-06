package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_g {
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.manage().window().maximize();
		
		WebElement e = dr.findElement(By.xpath("//button[@id='alertButton']"));
		e.click();
		Thread.sleep(4000);
		dr.switchTo().alert().accept();
		
		WebElement r = dr.findElement(By.xpath("//button[@id='confirmButton']"));
		r.click();
		Thread.sleep(6000);
		dr.switchTo().alert().dismiss();
		
		WebElement y = dr.findElement(By.xpath("//button[@id='promtButton']"));
		y.click();
		dr.switchTo().alert().sendKeys("hindi theriyathu poda");
		dr.switchTo().alert().accept();
		
	}

}
