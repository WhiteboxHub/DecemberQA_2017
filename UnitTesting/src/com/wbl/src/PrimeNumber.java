package com.wbl.src;

public class PrimeNumber {

	public boolean isPrime(int input) {
		
		System.out.println("this is aprime method");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (input == 0 || input == 1) {
			return false;
		}
		for (int i = 2; i <= (input / 2); i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

}
/// 2,3, 5,7,11,13,17