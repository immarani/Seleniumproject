package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBank {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			for(int i=1;i<=5;i++) {
				driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
				}
			driver.manage().window().maximize();
			Actions ac=new Actions(driver);
			
			
			WebElement drag=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	        WebElement drop=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		    ac.dragAndDrop(drag, drop).build().perform();
		    Thread.sleep(2000);
		    
			WebElement drag1=driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
		    WebElement drop1=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
			ac.dragAndDrop(drag1, drop1).build().perform();
		    Thread.sleep(1000);
			
			WebElement drag2=driver.findElement(By.xpath("//a[contains(text(),'SALES') ]"));
			WebElement drop2=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
			ac.dragAndDrop(drag2, drop2).build().perform();
			Thread.sleep(1000);
			
			WebElement drag3=driver.findElement(By.xpath("(//a[contains(text(),' 5000')])[2]"));
			WebElement drop3=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
			ac.dragAndDrop(drag3, drop3).build().perform();
		
		 
		
		
		
		
	}

}
