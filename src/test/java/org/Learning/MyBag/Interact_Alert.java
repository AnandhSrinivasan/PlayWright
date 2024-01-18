package org.Learning.MyBag;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Interact_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Page page = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome")).newPage();
		page.navigate("https://letcode.in/alert");
		
		//onDialog is an event Handler 
		page.onDialog(dialog -> {
			System.out.println(dialog.message());
			dialog.accept("Anandh");
			});
		//Accept Alert	//page.locator("#accept").click();
		
		//Prompt Alert
		page.locator("#prompt").click();
		
		//Get Name from field
		System.out.println(page.locator("#myName").textContent());
		
		page.close(); 
		playwright.close();
	}
}
