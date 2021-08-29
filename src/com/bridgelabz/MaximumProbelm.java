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
		
		String firstString= "first";
		String secondString ="second";
		String thirdString = "third";
		findMaxOfThree(firstString, secondString, thirdString);
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
	public static void findMaxOfThree(String one, String two,String three) {
		String maximumOfTwoStrings = (one.compareTo(two) > 0 ? one : two);
		String maximumString = (one.compareTo(three) > 0 ? one : three);
		System.out.println("Maximum of three integers are:" + maximumString);
	}
}
