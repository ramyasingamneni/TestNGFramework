package orangehrm.testcases;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeDeleteTest
{

	public static void main(String[] args) throws Throwable
	{
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		Employee emp=new Employee();
		boolean res= emp.deleteEmployee("1630");
		if(res)
		{
			System.out.println("Deletion of Employee Test Pass");
		}
		else
		{
			System.out.println("Deletion of Employee Test Pass");
		}
		lp.logout();
		AppUtils.closeApp();

	}

}
