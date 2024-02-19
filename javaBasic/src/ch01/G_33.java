package ch01;

import java.util.Scanner;

public class G_33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;
		while ( number > 0) {
			sum += number % 10;
			int mok = number / 10;
			number = mok;
			if ( number < 0) {
				System.out.println("0");
			}
			
		}
System.out.println(sum);
	}

}
