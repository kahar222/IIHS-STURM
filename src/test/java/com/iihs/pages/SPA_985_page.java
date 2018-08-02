package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.tests.TestBase;
import com.iihs.utilities.Driver;

public class SPA_985_page{
	
	public SPA_985_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	//KK
		@FindBy(xpath="(//div[1]/div[3]/div)[2]")
		public WebElement firstParagraph;
		
//		@FindBy(xpath="(//div[2]/div/a)[2]")
//		public WebElement allFatalityFactsTopics;
		
		@FindBy(xpath="(//div/ul/li[6]/a)[6]")
		public List<WebElement> GenderLink;
		
		@FindBy(xpath="(//div/ul/li[2])[9]")
		public List<WebElement> DataSubsectionsLinks;
}
