package problemsPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		
		 Scanner scr = new Scanner(System.in);
		  System.out.print("Input String :- ");
		  
		  char [] Letters = scr.nextLine().toCharArray();
		  
		  System.out.print("Revers String :- ");
		  for(int i = Letters.length-1;i>=0;i--) {
			  System.out.print(Letters[i]);
		  }
		  
		  

	}

}
