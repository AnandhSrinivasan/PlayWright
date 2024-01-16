package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Launch_HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch();
		Page page = browser.newPage();
		page.navigate("https://www.saucedemo.com/");
		String title = page.title();
		System.out.println("Launching web browser Title is " + title);
		page.close();
		browser.close();
		playwright.close();
	}

}
