package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']")).click();
Thread.sleep(3000);
		WebElement	electronic=	driver.findElement(By.xpath("//span[text()='Electronics']"));
Actions ac=new Actions(driver);
ac.moveToElement(electronic).build().perform();
Thread.sleep(4000);

//WebElement clk = driver.findElement(By.xpath("//a[@title='Mi']"));
//
//clk.click();

	

	}

}
