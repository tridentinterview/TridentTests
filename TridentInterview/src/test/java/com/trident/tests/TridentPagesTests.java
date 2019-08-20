package com.trident.tests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trident.base.TestBase;
import com.trident.pages.TridentPages;

public class TridentPagesTests extends TestBase {
	TridentPages tridentPages;
	
	public TridentPagesTests() 
	{
		super(); 
		
	}
	
	@BeforeClass
	public void setUp()
	{
		
		 initilization();
		 tridentPages =new TridentPages();
		 
	}
	
	@AfterClass
	public void tearDown()

	{
		driver.quit();
	}
	
	
	
	@Test(priority = 1, description = " Scenario 1 : Get the Search Box  Value Exact Text")
	public void placeHolderValueGetText()
	{
		Assert.assertEquals(tridentPages.placeHolderValueGetText(), "Search over 22,253 APIs and much more");
	}
	
	
	
	@Test(priority = 2, description = " Scenario 2 : Get the search Box Number value with adding Some prefix and suffix text")
	public void placeHolderValueTest()
	{
		Assert.assertEquals(tridentPages.placeHolderValueGetNumber(), "Programmableweb has 22253 APIs");
	}
	
	
	
	@Test(priority = 3, description = " Scenario 3 : Get the List Value of all the tabs and adding some prefix and suffix")
	public void tabsListsGetText()
	{
		String[] expectedArray = { "There are 132 Articles in this page", "There are 221 APIs in this page", "There are 12 Mashups in this page", "There are 68 SDKs in this page", "There are 1 Libraries in this page", "There are 18 SampleSourceCode in this page", "There are 3 Followers in this page", "There are 12 Developers in this page"};
		List<String> expectedArrayLists = Arrays.asList(expectedArray);
		
		Assert.assertEquals(tridentPages.tabsListsGetText(), expectedArrayLists);
	}
	
	
	
	@Test(priority = 4, description = " Scenario 4 : Get the total count of the list value numbers")
	public void totalNumResources()
	{
		int totalResources = 467;
		Assert.assertEquals(tridentPages.totalNumResources(), totalResources);
	}
	
}
