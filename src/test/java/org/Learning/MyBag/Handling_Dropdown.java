package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class Handling_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser =  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		page.navigate("https://letcode.in/dropdowns");
		//When Using selectOptions is one method to use Dropdown 
		page.selectOption("//select[@id='fruits']", "4");
		
		//When Using Locator is another options to use Dropdown
		//Locator locator = page.locator("//select[@id='fruits']");
		//locator.selectOption("1");//select by value
		//locator.selectOption(new SelectOption().setValue("0"));// By value
		//locator.selectOption(new SelectOption().setLabel("Banana"));//By visible text
		//locator.selectOption(new SelectOption().setIndex(3)); //By index 
		
		String text = page.locator("//div[@class='notification is-success']").textContent();
		//textContent is like getText method 
		System.out.println(text);
		
		Locator superHero = page.locator("//select[@id='superheros']");
		superHero.selectOption(new String[] {"aq", "bt", "xm"});					
	}

}
