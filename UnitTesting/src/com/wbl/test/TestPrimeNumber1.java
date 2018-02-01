package com.wbl.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wbl.src.PrimeNumber;

public class TestPrimeNumber1 {

	static PrimeNumber pn;

	@BeforeClass
	public static void beforeClass() {
		pn = new PrimeNumber();
		System.out.println("this Excute Once before Every all methods");
	}

	@AfterClass
	public static void afterClass() {
		pn = new PrimeNumber();
		System.out.println("this Excute Once after Every all methods");
	}

	@Before
	public  void before() {
		pn = new PrimeNumber();
		System.out.println("this Excute Once before Every all methods");
	}

	@After
	public  void after() {
		pn = new PrimeNumber();
		System.out.println("this Excute Once after Every all methods");
	}

	@Test
	public void voidIsPrime() {
	boolean result = pn.isPrime(5);
		assertEquals(true, result);
	}

	@Test
	@Ignore
	public void IsPrime1() {
		boolean result = pn.isPrime(1);
		assertEquals(false, result);
	}

	@Test
	public void voidIsPrime2() {
		boolean result = pn.isPrime(10);
		assertEquals(false, result);
	}

	@Test
	public void voidIsPrime3() {
     boolean result = pn.isPrime(0);
		assertEquals(false, result);
	}

}
