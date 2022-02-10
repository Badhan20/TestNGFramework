package p_04_SkipTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class C_17_SkipTest_1 {
	
	boolean dataCreation = true;
	
	//Not enabled
	@Test(enabled=false)
	public void notEnabled() {
		
		System.out.println("Test case skipped due to not enabled.");
	}
	
	
	//Force Skip
	@Test
	public void forceSkip() {
		
		System.out.println("Test case skipped forcefully.");
		
		throw new SkipException("Forcefully skipped.");
	}
	
	//Conditional Skip
	@Test
	public void conditionalSkip() {
				
		if(dataCreation==true) {
			
			System.out.println("Test case not skipped.");
		}
		
		else {
			
			System.out.println("Test case skip based on condition.");
			
			throw new SkipException("Conditional skip.");
		}
		
	}

}
