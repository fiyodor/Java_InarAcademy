package chapters.chapter_05.checkpoints;

import java.util.Scanner;

public class Checkpoint_06 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int number, max;
	number = input.nextInt();
	max = number;
	do {
	number = input.nextInt();
	if (number > max)
	max = number;
	} while (number != 0);
	System.out.println("max is " + max);
	System.out.println("number " + number);
	}
	}

// max is 5 number is 0
