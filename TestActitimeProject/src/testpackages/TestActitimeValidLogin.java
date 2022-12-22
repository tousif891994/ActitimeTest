package testpackages;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackages.LoginPage;
@Listeners(CustomListner.class)

public class TestActitimeValidLogin extends BaseTest {
	@Test
	 public void testValidLogin() throws InterruptedException, IOException
	 {
		LoginPage lp=new LoginPage(driver);
		Flib flib=new Flib();
		lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
	 }
	

}

