package testpackages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackages.LoginPage;
@Listeners(CustomListner.class)

public class TestActitimeInvalidLogin extends BaseTest{
	
	@Test
	public void testInvalidLogin() throws EncryptedDocumentException, InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invaliddata");
		for (int i = 1; i <=rc; i++) 
		{
			lp.invalidLoginToActiTime(flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0), flib.readExcelData(EXCEL_PATH,"invaliddata",i,1));
		}
		
	}

}
