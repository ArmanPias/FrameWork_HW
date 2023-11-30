package base;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

import java.time.Duration;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	public Configuration configuration;
	public Actions actions;
	public JavascriptExecutor js;
	@BeforeMethod
	public void setup() {
		configuration = new Configuration();

		browserSlt(configuration.getProps(BROWSER));
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProps(URL));
		long plt = Long.parseLong(configuration.getProps(PAGELOAD_WAIT));
		
		long icw = Long.parseLong(configuration.getProps(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(plt));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(icw));
		drivers();
		actions = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	public void browserSlt(String x) {

		switch (x) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
		   WebDriverManager.safaridriver().setup();
		   driver = new SafariDriver();
			
		}
		}



	public void drivers() {
		homePage = new HomePage(driver);

	}
	@AfterMethod
	public void end() {
		driver.quit();
	}

}
