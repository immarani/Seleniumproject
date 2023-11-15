package basicSeleinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\imimm\\eclipse-workspace\\Selenium\\target\\chromedriver.exe"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.amazon.in");
		String url="https://www.amazon.in";
		driver.get(url);
		driver.manage().window().maximize();
	//	driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
	//driver.navigate().back();
     String currentUrl=driver.getCurrentUrl();
 
		System.out.println(currentUrl);
		if (url.equals(currentUrl)) {
			System.out.println("Entered URL is correct" +currentUrl);
		} 
		else {
			System.err.println("Instead of getting valid url we got unvalid url");
		}
	//driver.manage().window().minimize();
	//Thread.sleep(2000);
		//String title=driver.getTitle();
	//	System.out.println(title);
		
	//	Thread.sleep(1000);
//		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//driver.close();
		//driver.quit();

	}               

}
