package org.Learning.MyBag;

import java.util.List;

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
		
		/*
		 * Locator superHero = page.locator("//div[@class='select is-multiple']");
		 * superHero.selectOption(new String[] {"aq", "bt", "xm"});
		 */					
		
		Locator prgln = page.locator("//select[@id='lang']");
		Locator options = prgln.locator("option");
		int values= options.count();
		System.out.println("Length :" + values);
		prgln.selectOption(new SelectOption().setIndex(values-1));

		//Print all the dropdown values in the web page
		List<String> all = options.allInnerTexts(); 
		all.forEach(i->System.out.println(i));
	}

}
