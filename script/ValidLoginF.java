package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPageF;

public class ValidLoginF extends BaseTest{

	@Test(priority=1)
	public void testValidLoginF()
	{
		String un = FWUtil.getXLData(INPUT_PATH, "ValidLoginF", 1, 0);
		String pw = FWUtil.getXLData(INPUT_PATH, "ValidLoginF", 1, 1);
		//String homepageTitle = FWUtil.getXLData(INPUT_PATH, "ValidLoginF", 1, 2);
		//String un = ActiTimeFWUtil.getXLData(INPUT_PATH, "ValidLogin", 1, 0);
		//String pw = ActiTimeFWUtil.getXLData(INPUT_PATH, "ValidLogin", 1, 1);
		
		LoginPageF l = new LoginPageF(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLoginF();
	}
	

	
	
}
