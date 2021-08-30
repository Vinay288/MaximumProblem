package com.bridgelabz;

public class MaximumProblem<E extends Comparable<E>> {

	E firstValue, secondValue, thirdValue;

	MaximumProblem(E first, E second, E third) {
		this.firstValue = first;
		this.secondValue = second;
		this.thirdValue = third;
	}

	public void findMaxOfThree() {

		E maximumOfTwo = (firstValue.compareTo(secondValue) > 0 ? firstValue : secondValue);
		E maximum = (maximumOfTwo.compareTo(thirdValue) > 0 ? maximumOfTwo : thirdValue);
		System.out.println(maximum);
	}

	public static void main(String[] args) {
		
		Integer firstInteger = 9;
		Integer secondInteger = 6;
		Integer thirdInteger = 2;
		new MaximumProblem<Integer>(firstInteger, secondInteger, thirdInteger).findMaxOfThree();

		Float firstFloat = 2.55f;
		Float secondFloat = 3.33f;
		Float thirdFloat = 1.34f;
		new MaximumProblem<Float>(firstFloat, secondFloat, thirdFloat).findMaxOfThree();

		String firstString = "first";
		String secondString = "second";
		String thirdString = "zzzzzz";
		new MaximumProblem<String>(firstString, secondString, thirdString).findMaxOfThree();
	}
}
