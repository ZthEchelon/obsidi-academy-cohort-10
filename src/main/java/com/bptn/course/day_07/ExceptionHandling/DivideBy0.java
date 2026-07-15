package com.bptn.course.day_07.ExceptionHandling;

public class DivideBy0 {
	
	public static int divide(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		int[] arr = {4, 0, 2, 4, 6, 9};
		try {
			System.out.println(divide(4, 0));
			System.out.println(arr[10]);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero: " + e.getMessage());
			System.out.println("Trying to divide it with 2 instead...");
			System.out.println(divide(4, 2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds: " + e.getMessage());
			System.out.println("Trying to access the last element instead...");
			System.out.println(arr[arr.length - 1]);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			System.out.println("Execution completed.");
		}
	}
}
