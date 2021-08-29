package com.bridgelabz;

public class MaximumProbelm {

	public static void main(String[] args) {
		Integer firstNumber = 2;
		Integer secondNumber = 20;
		Integer thirdNumber = 9;
		maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

		Float firstFloat = 2.55f;
		Float secondFloat = 1.23f;
		Float thirdFloat = 2.12f;
		findMaxOfThree(firstFloat, secondFloat, thirdFloat);
	}

	public static void maxOfThreeNumbers(Integer one, Integer two, Integer three) {
		Integer maximumOfTwoIntegers = (one.compareTo(two) > 0 ? one : two);
		Integer maximumInteger = (one.compareTo(three) > 0 ? one : three);
		System.out.println("Maximum of three integers are:" + maximumInteger);
	}

	public static void findMaxOfThree(Float one, Float two, Float three) {
		Float maximumOfTwoFloats = (one.compareTo(two) > 0 ? one : two);
		Float maximumFloat = (one.compareTo(three) > 0 ? one : three);
		System.out.println("Maximum of three integers are:" + maximumFloat);
	}
}
