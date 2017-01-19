package practiceScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {
		
	//	System.setProperty("webdriver.gecko.driver", "E:\\SRINU\\SelDownload\\geckodriver.exe");
		
		//WebDriver d=new FirefoxDriver();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setPlatform(Platform.ANY);
		
		dc.setBrowserName("firefox");
		
		System.setProperty("webdriver.gecko.driver", "E:\\SRINU\\SelDownload\\geckodriver.exe");
		
		WebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		
		
		d.navigate().to("http://google.com");
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		
		System.out.println("Total links  :"+links.size());
		
		int cnt=0;
		
		for (int i = 0; i < links.size(); i++) {
			
			/*if (links.get(i).isDisplayed()) {
				
				cnt++;
				
				links.get(i).click();
				d.navigate().back();
				
				links=d.findElements(By.tagName("a"));
				
				System.out.println(d.getCurrentUrl());
				
				}*/
			
if (links.get(i).getLocation().getX()>0||links.get(i).getLocation().getY()>0) {
				
				cnt++;
				
				links.get(i).click();
				d.navigate().back();
				
				links=d.findElements(By.tagName("a"));
				
				System.out.println(d.getCurrentUrl());
				
				}
			
		}
		
		System.out.println("Total Visisble Links :"+cnt);
		
		
		
		
		

	}

}
