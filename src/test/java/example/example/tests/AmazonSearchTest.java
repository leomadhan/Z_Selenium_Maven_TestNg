package example.example.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import example.example.factory.*;
import example.example.pages.AmazonHomePage;
import example.example.retry.RetryTestListener;

/**
 * The Class FlightBookingTest.
 *
 * @author MMM -z
 */
@Test(testName = "Amazon Search test", description = "Amazon product search test")
@Listeners(RetryTestListener.class)
public class AmazonSearchTest extends BaseTest {

	@Test
	public void amazonSearchTest() {
		driver.get("https://www.amazon.in//");
		AmazonHomePage amzonHomePage = PageinstancesFactory.getInstance(AmazonHomePage.class);
		amzonHomePage.searchItem("Samsung").selectSuggestedKeywordByIndex(4).clicksearchedResult();
		
	}
}
