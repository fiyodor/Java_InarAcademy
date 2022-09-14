package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_18 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		
		int number = input.nextInt();
		
		
		for(int i = 1 ; i <= number ; i++) {
		
			for(int j = i * 2  ; j <=( number * 2) ; j++ ) {
			
				System.out.print(" ");
			}
		
			for( int k =  i  ; k > 0 ; k--){
				
				System.out.print(k);
				
				System.out.print(" ");
				
			}
			
			for (int k = 2 ; k <= i ; k++ ) {
			
				System.out.print(k + " ");
			}
			
			System.out.println();
		}
	}

}