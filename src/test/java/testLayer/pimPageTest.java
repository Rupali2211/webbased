package testLayer;

import pages.HomePage;
import pages.LoginPage;
import pages.pimPage;

public class pimPageTest {

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.loginFunctionality("Admin","admin123" );
		HomePage home=new HomePage();
		home.validateLogo();
		pimPage page=new pimPage();
		page.clickOnPimLink();
	

}
}
