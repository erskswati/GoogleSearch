package testScript;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.InstagramGoogleResultPO;


public class InstagramTest extends BaseTest{
	@Test
	public void testInsta() {
		try {
			driver.get(TEST_URL);
			GooglePagePO googlePagePO=new GooglePagePO(driver);
			googlePagePO.googleSrch("instagram");
			InstagramGoogleResultPO pagePO=new InstagramGoogleResultPO(driver);
			Reporter.log("Total no.of Links = "+pagePO.allLinksSize(),true);
			pagePO.firstLink().click();
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(driver.getTitle());*/
			String eTitle = "Instagram";
			pagePO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
}
