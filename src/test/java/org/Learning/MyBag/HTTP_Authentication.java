package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HTTP_Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Playwright play = Playwright.create();
	Browser browser = play.chromium().launch();
	BrowserContext context = browser.newContext(new Browser.NewContextOptions().setHttpCredentials("admin", "admins"));
	Page page =context.newPage();
	page.navigate("https://the-internet.herokuapp.com/basic_auth");
	System.out.println(page.locator("h3").textContent());
	page.close();
	browser.close();
	play.close();
	}
}
