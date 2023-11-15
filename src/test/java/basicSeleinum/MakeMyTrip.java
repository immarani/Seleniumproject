package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imimm\\eclipse-workspace\\Selenium\\target\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	
	driver.manage().window().maximize();
	//Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();//popup
	
	Thread.sleep(5000);
	WebElement iframe = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
driver.switchTo().frame(iframe);//iframe
driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();//ads
Thread.sleep(2000);
//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();//popup
driver.switchTo().parentFrame();
Thread.sleep(2000);

WebElement oneway = driver.findElement(By.xpath("//li[contains(text(),'One Way')]"));
oneway.click();
boolean selected = oneway.isEnabled();
System.out.println(selected);
Thread.sleep(2000);
WebElement round =driver.findElement(By.xpath("//li[text()='Round Trip']"));
round.click();
boolean enable=round.isEnabled();
System.out.println(enable);
Thread.sleep(2000);

driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[contains(text(),'One Way')]")).click();

driver.findElement(By.xpath("//span[text()='From']")).click();
WebElement from = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
Actions ac=new Actions(driver);
ac.moveToElement(from).build().perform();
ac.click().build().perform();

driver.findElement(By.xpath("//span[text()='To']")).click();
WebElement to = driver.findElement(By.xpath("//p[text()='Mumbai, India']"));//Actions ac=new Actions(driver);
ac.moveToElement(to).build().perform();
ac.click().build().perform();




	}}


