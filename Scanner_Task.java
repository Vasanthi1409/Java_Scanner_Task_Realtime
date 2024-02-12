package scanner_Task.com;

import java.util.Scanner;

public class Scanner_Task {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int Integer_Value = sc.nextInt();
		
		int odd_even = Integer_Value % 2;

		if(odd_even != 0) {
			System.out.println("Happy");
		}else if(odd_even == 0 && Integer_Value <= 5 && Integer_Value >= 2) {			
			System.out.println("Super");
		}else if(odd_even == 0 && Integer_Value <= 20 && Integer_Value >= 6) {
			System.out.println("Happy");
		}else {
			System.out.println("Super");
		}
	}

}
