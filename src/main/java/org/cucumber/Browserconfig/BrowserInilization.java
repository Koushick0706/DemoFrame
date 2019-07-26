package org.cucumber.Browserconfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;

public class BrowserInilization extends Browserconfig {
	public static Properties prop;
	WebDriver driver;
	
	public void startReport() throws IOException {	
		prop = new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\koushicks\\eclipse-workspace\\HybridFramework\\role.properties"));
		prop.load(reader);
		System.out.println(prop);
		driver = choosebrowser("Chrome", "https://github.com/login");
	}

}
