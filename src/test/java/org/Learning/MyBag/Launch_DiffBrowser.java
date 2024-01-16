package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Launch_DiffBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright= Playwright.create();
		//Browser browser =playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Browser browser =playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://www.saucedemo.com/");
		String title= page.title();
		System.out.println("Launched Browser Title is " + title);
		page.close();
		browser.close();
		playwright.close();
	}

}
