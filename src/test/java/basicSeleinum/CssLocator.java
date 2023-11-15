package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imimm\\eclipse-workspace\\Selenium\\target\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("a#webklipper-publisher-widget-container-notification-close-div"));//		tN#idValue
    driver.findElement(By.cssSelector("span.commonModal__close"));//tN.classValue
    driver.findElement(By.cssSelector("a[class*='primaryBtn font24 latoBold widgetSearchBtn']"));//			contains = *
    driver.findElement(By.cssSelector("p[class^='user']"));   		//Startswith = ^  // input[title^='Search for products']
    driver.findElement(By.cssSelector("p[class$='PerText']"));//endswith = $
    driver.findElement(By.cssSelector("ul[class='specialFareNew']>li.font12.blackText.wrapFilter.activeItem")); //Immediate child = >
	driver.findElement(By.cssSelector("label[for='fromCity'] input"));//subchild = space
	driver.findElement(By.cssSelector("label[for='fromCity']>span:nth-of-type(1)"));//array to locate = nth-of-type(i)
	driver.findElement(By.cssSelector("div[class='flt_fsw_inputBox searchCity inactiveWidget ']>label:last-child")); //To locate last webelement = last-child

	
	}

}
