package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ji {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
		
		WebDriver s=new ChromeDriver();
		
     	s.get("https://demoqa.com/buttons");		
		
		WebElement y = s.findElement(By.xpath("//button[text()='Click Me']"));
     	Actions j=new Actions(s);
		j.click(y).build().perform();
		
		WebElement f = s.findElement(By.xpath("//button[text()='Right Click Me']"));
	    j.contextClick(f).build().perform();
	    
	    WebElement d = s.findElement(By.xpath("//button[text()='Double Click Me']"));
	    j.doubleClick(d).build().perform();
		
		
		s.navigate().to("https://jqueryui.com/droppable/");
		
		//Thread.sleep(3000);
		s.switchTo().frame(0);
		
		WebElement k = s.findElement(By.id("draggable"));
		WebElement l = s.findElement(By.id("droppable"));
		j.dragAndDrop(k, l).perform();
		//j.moveToElement(l).build().perform();
		
	}
}
