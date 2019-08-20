package com.trident.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.trident.base.TestBase;

public class TridentPages extends TestBase {
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='edit-term--2']"));

	WebElement tabField = driver.findElement(By.id("myTab"));

	List<WebElement> tabs = tabField.findElements(By.tagName("li"));
	
	//Scenario one Function
	public String placeHolderValueGetText() {
		System.out.println("Scenario One Result : " + searchBox.getAttribute("placeholder"));
		return searchBox.getAttribute("placeholder");

	}
	
	//Scenario Two Function
	public String placeHolderValueGetNumber() {

		String txtplaceholder = searchBox.getAttribute("placeholder");
		String onlyNumber = null;
		onlyNumber = txtplaceholder.replaceAll("[^0-9]", "");
		String combinedOutput = "Programmableweb has " + onlyNumber + " APIs";
		System.out.println("Scenario Two Result : " + combinedOutput);
		return combinedOutput;

	}
	
	//Scenario Three Function
	public List<String> tabsListsGetText() {
		List<WebElement> totalLi = driver.findElements(By.xpath("//*[@id='myTab']/li"));
		List<String> list = new ArrayList<String>();
		String byOrder = null;
		int byNumber = 0;
		String byText = null;
		String combinedText = null;
		for (int i = 2; i <= totalLi.size(); i++)

		{

			byOrder = driver.findElement(By.xpath("//*[@id='myTab']/li[" + i + "]")).getText();

			byNumber = Integer.parseInt(byOrder.replaceAll("[^0-9]", ""));

			byText = byOrder.replaceAll("[0-9() ]", "").trim();
			combinedText = "There are " + byNumber + " " + byText + " in this page";
			list.add(combinedText);

		}
		System.out.println("Scenario Three Result : "+ list);
		return list;

	}
	
	//Scenario Four Function
	public int totalNumResources() {
		int totalResources = 0;
		int byNumber = 0;
		String byOrder = null;
		List<WebElement> totalLi = driver.findElements(By.xpath("//*[@id='myTab']/li"));
		for (int i = 2; i <= totalLi.size(); i++)

		{
			byOrder = driver.findElement(By.xpath("//*[@id='myTab']/li[" + i + "]")).getText();
			byNumber = Integer.parseInt(byOrder.replaceAll("[^0-9]", ""));
			totalResources = totalResources+byNumber;
			byNumber = 0;
			
		}
		System.out.println("Scenario Four Result : " + totalResources);
		return totalResources;
		
	}
}
