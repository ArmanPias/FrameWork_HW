package base;

import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

import java.time.Duration;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	public Configuration configuration;

	@BeforeMethod
	public void setup() {
		configuration = new Configuration();

		browserSlt(configuration.getProps(BROWSER));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProps(URL));
		long plt = Long.parseLong(configuration.getProps(PAGELOAD_WAIT));
		// System.out.println(lg);
		// line-->29/31 we are converting String numbers to INTEGER TYP.
		long icw = Long.parseLong(configuration.getProps(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(plt));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(icw));
		drivers();
	}

	public void browserSlt(String x) {

		switch (x) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			driver = new ChromeDriver();
			break;
		case "Firefox":
		//	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
			driver = new FirefoxDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
		}
		}
//
//	if(x) {
//			
//		}else if() {
//		
//	}else if() {
//			
//		}else {
//		System.out.println("nothing");
//	}
//

	public void drivers() {
		homePage = new HomePage(driver);

	}
	@AfterMethod
	public void end() {
		driver.quit();
	}

}
