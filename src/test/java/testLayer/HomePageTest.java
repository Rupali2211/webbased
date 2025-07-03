package testLayer;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest {

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.loginFunctionality("Admin","admin123" );
		HomePage home=new HomePage();
		home.validateLogo();
	}

}
