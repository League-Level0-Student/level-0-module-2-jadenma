//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		int count = 0;
		// 1. Use each value of randomNumber to give the user a random compliment.
		while (count <10) {
			int randomNumber = randomMaker.nextInt(5);
			System.out.println(randomNumber);
if (randomNumber == 0) { 
	System.out.println("You're amazing!!");
} else if (randomNumber == 1) { 
	System.out.println("You're nice!!");
} else if (randomNumber == 2) { 
	System.out.println("You're smart!!");
} else if (randomNumber == 3) { 
	System.out.println("You rock!!");
} else { 
	System.out.println("You're strong!!");
}
count++;
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
