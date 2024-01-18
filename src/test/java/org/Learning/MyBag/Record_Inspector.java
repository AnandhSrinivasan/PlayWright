package org.Learning.MyBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import java.util.*;

public class Record_Inspector {

	public static void main(String[] args) {

		    try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://demo.playwright.dev/todomvc/");
		      page.navigate("https://demo.playwright.dev/todomvc/#/");
		      page.navigate("https://letcode.in/");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log in")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter registered email")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter registered email")).fill("hello@gmail.com");
		      page.getByPlaceholder("Enter password").click();
		      page.getByPlaceholder("Enter password").fill("13456");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LOGIN")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Work-Space")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Drop-Down")).click();
		      page.locator("#superheros").selectOption("am");
		      page.locator("#superheros").selectOption("aq");
		      page.locator("#superheros").selectOption("ta");
		      page.locator("#fruits").selectOption("3");
		      page.locator("#lang").selectOption("swift");
		      page.locator("#country").selectOption("India");
		      //assertThat(page.locator("#country")).hasValue("India");
		      page.locator("#country").selectOption("Paraguay");
		      
		    }
		  }
}
