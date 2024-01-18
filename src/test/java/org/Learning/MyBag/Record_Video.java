package org.Learning.MyBag;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Record_Video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright play = Playwright.create();
		BrowserType browsertype = play.chromium();
		LaunchOptions headless =  new BrowserType.LaunchOptions().setHeadless(false);
		Browser browser = browsertype.launch(headless);
		BrowserContext context=  browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("videos/")).setRecordVideoSize(1028, 720));
		Page page = context.newPage();
		page.navigate("https://bookcart.azurewebsites.net/");
		page.click("//span[normalize-space()='Login']");
		page.locator("//input[@formcontrolname='username']").type("ortoni");
		page.locator("//input[@type='password']").type("Pass1234$");
		page.locator("(//button[@color='primary']//span[1]");
		String userName = page.locator("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]").textContent();
		System.out.println(userName);
		context.close();
		play.close();
	}

}
