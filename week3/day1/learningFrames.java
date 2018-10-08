package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://jqueryui.com/selectable/");
		driver.switchTo().frame(1);
		
		
		driver.findElementByXPath("//li[text()='Item 1']").click();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();
		driver.switchTo().parentFrame();
		WebElement frameEle = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameEle);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
