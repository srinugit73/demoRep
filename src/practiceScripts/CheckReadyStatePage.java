package practiceScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CheckReadyStatePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\SRINU\\SelDownload\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.navigate().to("https://www.redbus.in/");
		
		//d.get("http://google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		String rs=js.executeScript("return document.readyState").toString();
		System.out.println(rs);
		
		while (!rs.equalsIgnoreCase("complete")) {
			
			System.out.println("page loading....");
			
			rs=js.executeScript("return document.readyState").toString();
			
			
			
		}
		System.out.println("page fully loaded");
		
		
		

		

	}

}
