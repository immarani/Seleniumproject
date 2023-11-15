package basicSeleinum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//			Thread.sleep(3000);
//			driver.switchTo().alert().accept();
//			
//			//late popup or alerts
//			WebElement  timeAlertbutton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//			timeAlertbutton.click();
//			Thread.sleep(5000);
//			driver.switchTo().alert().accept();
			
			//Confirm or dismiss
//			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//			driver.switchTo().alert().dismiss();
//			
			//vaule apply and alerts (Promt)
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement promtButtonclick =driver.findElement(By.xpath("//button[@id='promtButton']"));
promtButtonclick.click();
Thread.sleep(2000);
    Alert button=driver.switchTo().alert();
    //Thread.sleep(2000);
button.sendKeys("promt");
//Thread.sleep(5000);
//String text=button.getText();
//System.out.println(text);
//Thread.sleep(3000);
//button.accept();


































		}
}
