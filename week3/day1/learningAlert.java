package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class learningAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	//	driver.findElementByXPath("//div[@class='h_menu_drop_button hidden-xs']").click();
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementById("loginbutton").click();
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println(alertText);
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		driver.findElementById("usernameId").sendKeys("Balaji");
		
		
		
		
		
		
		
		
		
		
		
		/*Alert alertRef = driver.switchTo().alert();
		alertRef.getText();
		alertRef.sendKeys("Hello");
		alertRef.accept();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
