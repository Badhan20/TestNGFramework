package p_03_Groups;

import org.testng.annotations.Test;

@Test(groups="verify functionality")
public class C_16_Group_ClassLevel {

	@Test(priority=1, groups={"functional", "sprint"})
	public void verifyURL() {

		System.out.println("Designed to verify the URL.");
	}

	@Test(priority=2, groups={"functional", "sprint"})
	public void verifyTitle() {

		System.out.println("Designed to verify the Title.");
	}

	@Test(priority=1, groups={"bvt", "reg"})
	public void verifyElement() {

		System.out.println("Designed to verify the Element.");
	}

	@Test(priority=2, groups={"bvt", "reg"})
	public void verifyLogin() {

		System.out.println("Designed to verify the Login.");
	}

	@Test(priority=3, groups="sprint")
	public void verifyLogout() {

		System.out.println("Designed to verify the Logout.");
	}

}
