package basicSeleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAndXpathAxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

 //tN[@aN='aV']
        WebElement findElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		findElement.sendKeys("Watches");
//tN[contains(@aN,'part of aV')]
		driver.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
 //tN[text()='tV']
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
 //tN[contains(text(),'part of tV')]
        driver.findElement(By.xpath("//a[contains(text(),'Smartphones')]")).click();
 //tN[starts-with(text(),'start of tV')]
        driver.findElement(By.xpath("//span[starts-with(text(),'Electro')]")).click();
 //tN[starts-with(@aN,'start of aV')] 
       driver.findElement(By.xpath("//div[starts-with(@id,'s-ref')]"));
     driver.findElement(By.xpath("//a[@id='skiplink']//preceding::a"));		//tN[@aN='aV']//preceding::tN
     driver.findElement(By.xpath("//div[@id='navbar']//following::div[@id='nav-belt']"));//tN[@aN='aV']//following::tN
     driver.findElement(By.xpath("//div[@id='navbar']//following-sibling ::div[@id='nav-belt']"));//tN[@aN='aV']//following-sibling::tN
     driver.findElement(By.xpath("//a[@id='skiplink']//preceding-sibling ::a"));	//tN[@aN='aV']//preceding-sibling::tN
     driver.findElement(By.xpath("//a[@id='skiplink']//preceding-sibling ::a/parent::div"));	//tN[@aN='aV']//parent::tN
     driver.findElement(By.xpath("@id='navbar']//ancestor::div[@id='nav-belt']"));	//tN[@aN='aV']//ancestor::tN
	driver.findElement(By.xpath("//div[@id='glow-ingress-block']/descendant::span[@id='glow-ingress-line2']"));	//tN[@aN='aV']//descendant::tN

	//div[text()='Fire TV']//preceding
//		CSS Locators
	driver.findElement(By.xpath("a#webklipper-publisher-widget-container-notification-close-div"));//		tN#idValue


//tN.classValue
//
//		other Attributes = tN[aN='aV]
//		input[type='text']
//
//		contains = *
//		input[title*='Search for products']
//
//		Startswith = ^
//		input[title^='Search for products']
//
//		endswith = $
//		input[title$='more']
//
//		Immediate child = >
//		form[class='_2M8cLY header-form-search']>div
//
//		subchild = space
//		form[class='_2M8cLY header-form-search'] div
//
//		array to locate = nth-of-type(i)
//		form[class='_2M8cLY header-form-search']>div:nth-of-type(i)
//
//		To locate last webelement = last-child
//		form[class='_2M8cLY header-form-search']>div>input:last-child

	}

}
