package util;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
	private static WebDriver driver;
	
    
    public static WebDriver getDriver(String browser)
    {
    	String firefox;
    	String chrome;
    	
    	String cwd = System.getProperty("user.dir");
    	String sistema = System.getProperty("os.name");
    	if (sistema.equalsIgnoreCase("linux")) {
    		System.out.println("Driver Linux");
    		 chrome = "/drivers/chromedriver";
        	 firefox = "/drivers/geckodriver";
    	}else{
    		System.out.println("Driver windows");
        	 chrome = "/drivers/chromedriver.exe";
        	 firefox = "/drivers/geckodriver.exe";
    	}

        if (driver == null)
        {
            
            if (browser.equals("firefox")){
                    FirefoxOptions  options = new FirefoxOptions();
                    String pathselenium = cwd+ firefox;
                    System.setProperty("webdriver.gecko.driver", pathselenium);
                    //options.addArguments("--headless");
                    driver = new FirefoxDriver(options);
            }else{
            	String pathselenium = cwd+chrome;
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("--headless");
                System.setProperty("webdriver.chrome.driver", pathselenium);
                options.setCapability("applicationCacheEnabled", "false");
                System.out.println("Chrome driver: "+pathselenium);
                driver = new ChromeDriver(options);                 
            }
                    
        }
        return driver;
    }



}
