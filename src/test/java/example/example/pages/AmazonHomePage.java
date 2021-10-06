package example.example.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

/**
 * The Class represents AmazonHomePage.
 *
 * @author MMM
 */
public class AmazonHomePage extends BasePage {

	/** search by product keyword: textbox */
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchTextBox;

	/** Choose your keyword from suggestion list: div. */	
	@FindBys({
		@FindBy(xpath = "//*[@id=\"suggestions\"]/div")})	
	private List<WebElement> suggestionList;
	
	/** searched result: button. */
	@FindBy(xpath = "//*[@id=\"search\"]//a[@class=\"a-link-normal a-text-normal\"]")
	private WebElement searchedResult;

	/**
	 * Instantiates a new flight book page.
	 *
	 * @param driver the driver
	 */
	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * search product
	 *
	 * @param product Keyword
	 * 
	 */
	public AmazonHomePage searchItem(String productKeyword) {		
		searchTextBox.sendKeys(productKeyword);
		return this;
	}

	/**
	 * select destination.
	 *
	 * @param desination city
	 * 
	 */
	public AmazonHomePage selectSuggestedKeywordByIndex(int position) {
		suggestionList.get(position).click();		
		return this;
	}

	/**
	 * Click result row.
	 */
	public void clicksearchedResult() {
		searchedResult.click();
	}
}
