package test;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.css.model.CSSStyleSheetHeader;
import org.testng.annotations.Test;

import base.BaseClass;

public class HomePageTest extends BaseClass {
	// LOGO validation---->

	@Test(enabled = false)
	public void logoValidation() throws InterruptedException {

		driver.findElement(By.xpath("//img[@class='-oneX-header-logo' or @id='oneX-sf-logo']")).click();
		Thread.sleep(2000);
	}

	@Test(enabled = false)
	public void signin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void infoTest() throws InterruptedException {
		homePage.loginINFO();
	}

	@Test(enabled = false)
	public void SMQTest() throws InterruptedException {
		homePage.SMQ();
	}

	//// span[contains(text(),'Pay a Bil')]
	@Test(enabled = false)
	public void payAbill() {
		driver.findElement(By.partialLinkText("Pay a Bill")).isDisplayed();
	}

	@Test(enabled = false)
	public void payRN() throws InterruptedException {
		homePage.letsPayBills();
	}

	// Use getTitle(), getCurrentUrl(), getText(), getAttribute(), clear() method to
	// test.
	@Test(enabled = false)
	public void getTittle_Currenturl_text_Attribute() throws InterruptedException {
		driver.findElement(By.xpath(
				"(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]"))
				.isDisplayed();
		driver.findElement(By.xpath(
				"(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]"))
				.click();
		Thread.sleep(4000);
		System.out.println("Tittle of the Page :" + driver.getTitle());
		System.out.println("Current URL :" + driver.getCurrentUrl());
		String print01 = driver.findElement(By.xpath(
				"(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]"))
				.getAttribute("id");
		System.out.println("Attribute is :" + print01);
		driver.findElement(By.xpath(
				"(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]"))
				.sendKeys("99013");
//		driver.findElement(By.xpath("(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]")).sendKeys("99013", Keys.ENTER);
		// driver.findElement(By.xpath("(//input[@name='zipCode' or
		// @class='-oneX-textfield__input' or
		// @id='quote-main-zip-code-input'])[1]")).sendKeys("99013", Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]"))
				.clear();
		Thread.sleep(4000);
		// Also Used Keys.ENTER/RETUN on Line 61 62(to see what those 2 Methood do)
		// Console Result Line 65 - 69
		/*
		 * Tittle of the Page :State Farm Insurance Companies | Like a Good Neighbor -
		 * State Farm® Current URL :https://www.statefarm.com/ Attribute is
		 * :quote-main-zip-code-input PASSED:
		 * test.HomePageTest.getTittle_Currenturl_text_Attribute
		 */

		// From below i use those Methoods out of my curiosity (Got RESULT PASS)

		Thread.sleep(4000);
		driver.navigate().to("https://www.statefarm.com/claims/check-existing-claim");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}
	// Using navigate().to() method, navigate().back(), navigate().forward() and
	// navigate().refresh() .

	@Test (enabled = false)
	public void useof_NavigteTo_NavigteBack_NavigteForward_NavigteRefresh() throws InterruptedException {
	Thread.sleep(4000);
	driver.navigate().to("https://www.statefarm.com/claims/check-existing-claim");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(4000);
	}

	@Test(enabled = true)
	public void navTO() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/accounts/login/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(4000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	    WebElement av = 	driver.findElement(By.xpath("(//button[@class='btn.btn-pmary'])[1]"));
	    System.out.println("I am here" + av);
		Thread.sleep(4000);
		WebElement test = driver.findElement(By.xpath("(//button[@class='btn.btn-primary'])[1]"));
		js.executeScript("arguments[0].click()", test);
		Thread.sleep(4000);
	
}
	
	

	
	}


