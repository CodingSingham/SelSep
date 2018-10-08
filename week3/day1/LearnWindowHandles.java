package week3.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		
		Set<String> allWindows = driver.getWindowHandles();
		//convert the set into the list
		List<String> lst = new ArrayList<>();
		lst.addAll(allWindows);
		driver.switchTo().window(lst.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByPartialLinkText("View Offer").click();
		
		Set<String> allwindow1 = driver.getWindowHandles();
		List<String> lst1 = new ArrayList<>();
		lst1.addAll(allwindow1);
		driver.switchTo().window(lst1.get(2));
		System.out.println(driver.getTitle());
				
		//Taking Snapshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File obj= new File("./Snaps/img1.jpeg");
		FileUtils.copyFile(src, obj);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}}
