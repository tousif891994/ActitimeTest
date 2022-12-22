package testpackages;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackages.HomePage;
import pagepackages.LoginPage;
@Listeners(CustomListner.class)
public class TestActitimeLogout extends BaseTest{
	
	@Test
	public void testLogout() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.logOutmethod();
	}

}
