package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NGKLK\\eclipse-workspace\\Demo\\driver\\chromedriver.exe" );
	
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.ironspider.ca/forms/dropdowns.htm#multiple");
	
    WebElement t = dr.findElement(By.xpath("//select[@name='coffee2']"));
	Select s=new Select(t);
	boolean y = s.isMultiple();
	System.out.println(y);
	
	s.selectByValue("skim");
	s.selectByValue("milk2");
	
	List<WebElement> o = s.getOptions();
	for (WebElement webElement : o) {
		System.out.println(webElement.getText());
		
	}
}
}
