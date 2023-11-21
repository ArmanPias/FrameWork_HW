package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class HomePage {
	public WebDriver driver;
	public HomePage homePage;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='-oneX-header-top-menu-btn']//parent::span[text()='Log in']")
	WebElement login;
	@FindBy(xpath = "//label[text()='User ID']")
	WebElement username;
	@FindBy(name = "//input[@name='IDToken2']")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log ')]")
	WebElement submit;
	@FindBy(xpath = "(//input[@name='zipCode' or @class='-oneX-textfield__input' or @id='quote-main-zip-code-input'])[1]")
	WebElement zipit;
	@FindBy(xpath = "(//button[@id='quote-main-zip-btn' or @class='-oneX-btn-secondary'])[3]")
	WebElement startMyQuote;
    @FindBy (partialLinkText = "Pay a Bill")
	WebElement pay;
	@FindBy(xpath = "(//input[@class='-oneX-textfield--floating-input'])[1]")
	WebElement phoneNumber;
	@FindBy(name = "//input[@name='dob']")
	WebElement dob;
	@FindBy(id = "//button[@id='continueButton']")
	WebElement contnew;

	public void loginINFO() throws InterruptedException {
		clickElement(login);
		Thread.sleep(2000);

		inputText(username, "FarameWork23");
		Thread.sleep(2000);
		inputText(password, "ksdofnwj");
		clickElement(submit);
		Thread.sleep(2000);
	}

	public void SMQ() throws InterruptedException {
		clickElement(zipit);
		inputText(zipit, "99901");
		Thread.sleep(5000);
		clickElement(startMyQuote);
		Thread.sleep(3000);

	}

	public void letsPayBills() throws InterruptedException {
		clickElement(pay);
		clickElement(phoneNumber);
		inputText(phoneNumber, "9990001234");
		Thread.sleep(2000);
		clickElement(dob);
		inputText(dob, "11151999");
		Thread.sleep(2000);
		clickElement(contnew);
		Thread.sleep(2000);

	}

}
