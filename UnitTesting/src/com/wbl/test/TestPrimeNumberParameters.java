package com.wbl.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.wbl.src.PrimeNumber;
//import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestPrimeNumberParameters {
	static PrimeNumber pn;
	int input;
	boolean expectedOutPut;

	public TestPrimeNumberParameters(int input, boolean ExpectedOutput) {
		this.input = input;
		this.expectedOutPut = expectedOutPut;
	}

	@Parameterized.Parameters
	public static Collection dataForTest() {
		Object[][] testData = { { 1, false }, { 0, false }, { 10, false } };
		return Arrays.asList(testData);
	}

	@BeforeClass
	public static void beforeClass() {
		pn = new PrimeNumber();
		System.out.println("this will excute one before all test methods");
	}

	@Test
	public void isPrime() {
		boolean result = pn.isPrime(input);
	assertEquals(expectedOutPut, result);	
	}

}
