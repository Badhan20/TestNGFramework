package p_03_Groups;

import org.testng.annotations.Test;

public class C_14_Group_Single {

	@Test(priority=1, groups="functional")
	public void verifyURL() {

		System.out.println("Designed to verify the URL.");
	}

	@Test(priority=2, groups="functional")
	public void verifyTitle() {

		System.out.println("Designed to verify the Title.");
	}

	@Test(priority=1, groups="bvt")
	public void verifyElement() {

		System.out.println("Designed to verify the Element.");
	}

	@Test(priority=2, groups="bvt")
	public void verifyLogin() {

		System.out.println("Designed to verify the Login.");
	}

	@Test(priority=1, groups="reg")
	public void verifyLogout() {

		System.out.println("Designed to verify the Logout.");
	}

}
