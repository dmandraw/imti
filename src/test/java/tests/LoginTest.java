package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		lp.login("admin@yourstore.com", "admin");
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		lp.clickLogoutButton();
		lp.verifyApplicationTitle("Your store. Login");
	
	}

}
