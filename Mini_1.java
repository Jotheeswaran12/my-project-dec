package sele;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_1 {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
		
		WebDriver s=new ChromeDriver();
		
	 	s.get("http://automationpractice.com/");
	 	WebElement women = s.findElement(By.xpath("//a[@title='Women']"));
	 	women.click();
	 	
	 	JavascriptExecutor e=(JavascriptExecutor)s;
	    e.executeScript("window.scrollBy(0,1000)");
	    
	    WebElement print = s.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
	    print.click();
		
		WebElement qty = s.findElement(By.xpath("//input[@id='quantity_wanted']"));
		qty.click();
		qty.sendKeys("8");
		
		WebElement size = s.findElement(By.xpath("//select[@id='group_1']"));
		Select i=new Select(size);
		i.selectByIndex(2);
		
		
		WebElement but = s.findElement(By.xpath("(//button[@type='submit'])[3]"));
		but.click();
		Thread.sleep(3000);
		
		WebElement checkout = s.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		//Thread.sleep(4000);
		
		WebElement ch = s.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ch.click();
		
		
		JavascriptExecutor f=(JavascriptExecutor)s;
		f.executeScript("window.scrollBy(0,500)");
		
		WebElement u = s.findElement(By.xpath("//input[@id='email_create']"));
		u.sendKeys("iiikjkllllkjkkk@gmail.com");
		
		WebElement k = s.findElement(By.xpath("//button[@id='SubmitCreate']"));
		k.click();
		Thread.sleep(3000);
		
		WebElement g = s.findElement(By.name("customer_firstname"));
		g.sendKeys("jothees");
			//	Thread.sleep(3000);
		
		WebElement g1 = s.findElement(By.id("customer_lastname"));
		g1.sendKeys("waran");
		
    	WebElement g2 = s.findElement(By.id("passwd"));
		g2.sendKeys("jo9876");
		
		WebElement d = s.findElement(By.id("days"));
		Select o=new Select(d);
		o.selectByIndex(20);
		Thread.sleep(2000);
		
		WebElement d1 = s.findElement(By.id("months"));
		Select o1=new Select(d1);
        o1.selectByIndex(8);
		Thread.sleep(2000);
		
		WebElement d2 = s.findElement(By.name("years"));
		Select o2=new Select(d2);
        o2.selectByValue("2001");
		Thread.sleep(2000);
		
		WebElement h = s.findElement(By.id("uniform-newsletter"));
		h.click();
		
		WebElement y = s.findElement(By.id("company"));
		y.sendKeys("wipro");
		
		WebElement x = s.findElement(By.id("address1"));
		x.sendKeys("chennai,tamil nadu");
		
		WebElement x2 = s.findElement(By.id("address2"));
		x2.sendKeys("anna nagar");
		
		WebElement x3 = s.findElement(By.id("city"));
		x3.sendKeys("chennai");
	
		WebElement t = s.findElement(By.id("id_state"));
		Select w=new Select(t);
		w.selectByVisibleText("California");
		
		WebElement t1 = s.findElement(By.id("postcode"));
		t1.sendKeys("56788");
		
		WebElement t2 = s.findElement(By.id("phone_mobile"));
		t2.sendKeys("8766543329");
		
		WebElement t3 = s.findElement(By.id("submitAccount"));
		t3.click();
		
		WebElement r = s.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		r.click();
	    Thread.sleep(2000);
	    
	    WebElement r1 = s.findElement(By.id("uniform-cgv"));
	    r1.click();
	    
	   WebElement r2= s.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
	   r2.click();	
		
	   WebElement r3 = s.findElement(By.xpath("//a[@title='Pay by bank wire']"));	
	   r3.click();	
	   Thread.sleep(2000);
	   
	   WebElement r4 = s.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	   r4.click();
		
		
			
	}

	
}
