package kahar;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_985_page;
import com.iihs.tests.TestBase;
import com.iihs.utilities.BrowserUtils;

public class SPA_985_test extends TestBase {
	Fatality_Facts facts = new Fatality_Facts();
	
	SPA_985_page spa=new SPA_985_page();
	
	
	@Test(description="Navigate to:http://www.iihs.org/iihs/topics/t/general-statistics/fatalityfacts/overview-of-fatality-facts")
	public void spa985step1(){
		
	}
    @Test(description="Fatality Facts ---> Yearly snapshot -->Verify that 2015 is selected in the drop down menu")
	public void spa985step2(){
//		BrowserUtils.waitForClickablility(facts.snapshotYears, 15);
		facts.snapshotYears.click();
//		BrowserUtils.waitForClickablility(facts.link2015, 15);
		facts.link2015.click();
//		BrowserUtils.waitFor(3);
		Assert.assertTrue(spa.firstParagraph.getText().contains("2015"));
	}
    
    @Test(description="After choosing 2015 move to right to click on All Fatality Topic")
    public void spa985step3(){
    	facts.factsTopics.click();
    	String actualText=facts.linksOfFactsTopics.get(5).getText();
    	//String actualText=driver.findElement(By.xpath("(//div/ul/li[6]/a)[6]")).getText();
    	System.out.println("Text is "+actualText);
    	Assert.assertEquals(actualText,"Gender");
    }
    @Test(description="Select the Gender option and click ")
    public void spa985step4(){
    	spa.GenderLink.get(5).click();
    }
    @Test(description="Click on Age Differences and verify that Age Differences is Displayed under data subsections ")
    public void spa985step5(){
    	facts.dataSubsectionsLinks.get(1).click();
    	
    	
    }
    
    
}
