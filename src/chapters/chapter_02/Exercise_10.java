package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_10 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");

		double water = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		
		double finalTemperature = input.nextDouble();
		
		System.out.println("The energy needed is " + ( water * ( finalTemperature - initialTemperature) * 4184 ) );
		
	}
}
