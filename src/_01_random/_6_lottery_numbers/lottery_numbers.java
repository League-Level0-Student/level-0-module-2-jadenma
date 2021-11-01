package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int firstNum = ran.nextInt(99);
		int secondNum = ran.nextInt(99);
		int thirdNum = ran.nextInt(99);
		int fourthNum = ran.nextInt(99);
		int fifthNum = ran.nextInt(99);
		int sixthNum = ran.nextInt(99);
		JOptionPane.showMessageDialog(null, "Your lottery numbers are: "+firstNum+" "+secondNum+" "+thirdNum+" "+fourthNum+" "+fifthNum+" "+sixthNum);
	}
}