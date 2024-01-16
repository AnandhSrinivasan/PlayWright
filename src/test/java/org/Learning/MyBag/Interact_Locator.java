package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Interact_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		page.navigate("https://www.letcode.in/edit");
		String title = page.title();
		System.out.println("Launching web browser Title is " + title);
		
		//About Fill, Type both are used to enter text in field
		
		//page.locator("#fullName").fill("Muruganandh Srinivasan");
		page.fill("#fullName", "Muruganandh Srinivasan");
		//fill is copy paste and it is very fast
		//fill method we can used in any form fill areas
		//fill method is not append with texts present in field
		
		Locator locator =page.locator("#join");
		locator.press("End");
		locator.type(" Human"); 
		locator.press("Tab");
		//type is append with texts present in field
		//type is manual enter comparatively slow than fill method
		//type method we can used search areas
		
		String attribute= page.locator("id=getMe").getAttribute("value");
		System.out.println(attribute);
		page.locator("xpath=//input[@id='clearMe']").clear();
		//page.close();
		//browser.close();
		//playwright.close();
	}

}
