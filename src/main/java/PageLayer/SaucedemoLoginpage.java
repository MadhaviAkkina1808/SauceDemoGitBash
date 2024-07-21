package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class SaucedemoLoginpage extends BaseClass {

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginbutton;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement sort;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement addtocart1;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement addtocart2;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement addtocart3;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartbutton;

	@FindBy(id = "checkout")
	private WebElement checkout;

	@FindBy(id = "first-name")
	private WebElement fname;

	@FindBy(id = "last-name")
	private WebElement lname;

	@FindBy(id = "postal-code")
	private WebElement pcode;

	@FindBy(id = "continue")
	private WebElement continuebutton;

	@FindBy(id = "finish")
	private WebElement finishbutton;

	public SaucedemoLoginpage() {
		PageFactory.initElements(driver, this);
	}

	public void userEntersUsernameandpassword(String username1, String password1) {
		Wait.sendKeys(username,username1);
		Wait.sendKeys(password,password1);
		Wait.click(loginbutton);

	}

	public void userSortsfromaAddsthreeProducts(String value1) {
		Wait.click(sort);

		Select sel = new Select(sort);
		sel.selectByVisibleText(value1);
		Wait.click(addtocart1);
		Wait.click(addtocart2);
		Wait.click(addtocart3);
		Wait.click(cartbutton);

	}

	public void userClicksOnFinish() {
		Wait.click(checkout);
	}

	public void userDetailsConfirmorder(String firstname, String lastname, String postalcode) {
		Wait.sendKeys(fname,firstname);
		Wait.sendKeys(lname,lastname);
		Wait.sendKeys(pcode,postalcode);
		Wait.click(continuebutton);
		Wait.click(finishbutton);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
