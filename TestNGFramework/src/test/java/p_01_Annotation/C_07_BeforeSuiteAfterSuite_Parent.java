package p_01_Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class C_07_BeforeSuiteAfterSuite_Parent {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Suite Test Setup is completed.");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("Suite Test data is cleared.");
	}


}
