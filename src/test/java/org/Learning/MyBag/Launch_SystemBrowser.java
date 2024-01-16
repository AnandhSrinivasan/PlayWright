package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Launch_SystemBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright =Playwright.create();
		Browser browser =  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		page.navigate("https://www.saucedemo.com/");
		String title =  page.title();
		String url  =  page.url();
		System.out.println("Launched Website Title is " +title);
		System.out.println("Launched Website URL is " +url);
		page.close();
		browser.close();
		playwright.close();
	}

}
