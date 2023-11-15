package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imimm\\eclipse-workspace\\Selenium\\target\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
	
	driver.manage().window().maximize();
	//iframe
	driver.switchTo().frame("pact");
	 WebElement shadow = driver.findElement(By.xpath("//div[@id='snacktime']"));
	 WebElement script = driver.findElement(By.xpath("//a[contains(text(),'Testers Food')]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//Thread.sleep(2000);
//String Script="return argument[0].shadowRoot.querySelector('a').click()";
        Object execute = js.executeScript("return argument[0].shadowRoot.querySelector('a')",shadow);
        //Object execute1 = js.executeScript("return argument[0].shadowRoot.querySelector('a')",);

        System.out.println(execute);
        js.executeScript("argument[0].sha.click()",script);
	
	}

}
