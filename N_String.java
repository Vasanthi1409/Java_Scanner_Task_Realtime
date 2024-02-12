package scanner_Task.com;

import java.util.Scanner;

public class N_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int Integer_Value = sc.nextInt();
		
		String string_integer = String.valueOf(Integer_Value);
		if(string_integer instanceof String && Integer_Value >= -200 && Integer_Value <= 200) {
			System.out.println("Good Job");
		}else {
			System.out.println("Wrong Answer");
		}
	}
}
