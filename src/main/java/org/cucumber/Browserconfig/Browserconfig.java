package org.cucumber.Browserconfig;

import java.util.concurrent.TimeUnit;

import org.cucumber.Runner.Junit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserconfig {
	
	WebDriver driver;
	
	public WebDriver choosebrowser(String key,String url)
	{
		switch (key) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\koushicks\\Downloads\\chromedriver_win32\\chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\koushicks\\Downloads\\chromedriver_win32\\chromedriver.exe");
			this.driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\koushicks\\Downloads\\chromedriver_win32\\chromedriver.exe");
			this.driver = new InternetExplorerDriver();
			break;

		}
		this.driver.get(url);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();
		
		return driver;
		
	}


}
