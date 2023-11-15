package basicSeleinum;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

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
		
		TakesScreenshot takesScrenshot = (TakesScreenshot)driver;
		File src=takesScrenshot.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\imimm\\eclipse-workspace\\Selenium\\target\\scr1.png");
		FileUtils.copyFile(src,file);
		
	
	
	}

}
