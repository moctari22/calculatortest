package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	                   
	public void longCalculation() {
		try {
			Thread.sleep(2000);
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void longCalculationx() {
		try {
			Thread.sleep(2000);
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Set<Integer> digitsSet(int nombre) {

		final Set<Integer> integers = new HashSet<Integer>();
		final String numberString = String.valueOf(nombre);

		for (int i = 0; i < numberString.length(); i++) {
			if (numberString.charAt(i) != '-') {
				integers.add(Integer.parseInt(numberString, i, i + 1, 10));
			}
		}
		return integers;
	}

}
