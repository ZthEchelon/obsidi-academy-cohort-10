package com.bptn.course.day_07.CustomExceptionLoggingData;

import java.util.Scanner;

public class CustomException {
	
	private static void validateFileExtension(String fileName) throws FileExtensionException {
		if (!fileName.endsWith(".txt")) {
			throw new FileExtensionException("File doesn't have .txt extension");
		}
		
	}
	
    public static void main(String[] args) {
    	String fileName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name with correct extension i.e. .txt ");
        fileName = scanner.nextLine();
        try {
			validateFileExtension(fileName);
			System.out.println("File name is valid.");
		} catch (FileExtensionException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
        
    }
}

