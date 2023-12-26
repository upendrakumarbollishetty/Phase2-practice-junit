package Phase2Assisted.junit5practice;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import junit.unittest.AgeCalculator;

// TODO : WAT with TDD for all possible use case for retirement calculator.
public class RetirementCalculatortest {

AgeCalculator ageCalculator;
	
	@BeforeEach
	public void setUp() {
		ageCalculator  = new AgeCalculator();
	}

	@AfterEach
	public void cleanUp() {
		if(ageCalculator!=null)
			ageCalculator = null;
	}
	
}



