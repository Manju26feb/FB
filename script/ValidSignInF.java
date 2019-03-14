package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPageF;

public class ValidSignInF extends BaseTest{
	
	@Test(priority=1)
	public void testValidSignInF()
	{
		/*String un = FWUtil.getXLData(INPUT_PATH, "ValidLoginF", 1, 0);
		String pw = FWUtil.getXLData(INPUT_PATH, "ValidLoginF", 1, 1);*/
		
		LoginPageF l = new LoginPageF(driver);
		l.setFirstName("Manju");
		l.setLastName("G");
		l.setMobileNo("9980458125");
		l.setNewPwd("9980458125abc");
		l.setDOB_Day("10");
		l.setDOB_Month("mar");
		l.setDOB_year("1985");
		l.setSEX("male");
		l.clickSignUp(driver);
		
	}	

}
