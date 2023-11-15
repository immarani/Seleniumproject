package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropGoat {

//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://beej.us/blog/data/drag-n-drop/");
			
			for(int i=1;i<=5;i++) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(5000);
			
			driver.switchTo().frame(0);
			
			Actions ec=new Actions(driver);
			WebElement goat=driver.findElement(By.xpath("//div[@id='playground']/img[@id='goat0']"));
			WebElement drop=driver.findElement(By.xpath("//div[text()='This is Dropzone 0']")) ;
			Thread.sleep(2000);
			ec.dragAndDrop(goat,drop).build().perform();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		
			WebElement goat3=driver.findElement(By.xpath("//img[@id='goat3']"));
			WebElement drop1=driver.findElement(By.xpath("(//div[@class='droptarget'])[2]"));
			ec.dragAndDrop(goat3, drop1).build().perform();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
		    
			WebElement Goat2 =driver.findElement(By.xpath("//div[@class='shadow2']/img[@id='goat2']"));
			WebElement Goat3 =driver.findElement(By.xpath("//img[@class='draggable stayinparent']"));
			Actions ac = new Actions(driver);
			ac.clickAndHold(Goat2).build().perform();
			Thread.sleep(3000);
			ac.moveToElement(Goat3).build().perform();
			ac.release().build().perform();
			
			
			
			
			
			
			

	}

}
