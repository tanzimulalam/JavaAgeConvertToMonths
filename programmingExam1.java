package com.project1;
import java.util.Scanner;
public class programmingExam1 {
	public static void main (String args[]) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String userName = inputScanner.next();
		System.out.println("How old are you?");
		int age = inputScanner.nextInt();
		int ageConvert = age * 12;
		System.out.println("Hello " + userName + "! You are " + ageConvert + " months old!");
		
	}


}

//Create a program that asks the user their name and age in years. 
//Print out a greeting for them and tell them how old are they in months. 
//You may ignore extra months added on. (example: if a birth day is in january but its february)
//
//Example:
//	What is your name? Jessica
//			How old are you? 26
//					Hello KJessica! You are 312 months old!
//					
//					Turn in guide
//					ThisPC/users/"Your username"/Eclipse-workspace/"Exam1"/src/whatever.java