package homework;

import java.util.Scanner;

public class PrintNumbers {
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter the skiped number");

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int i = 1;
		int m = 10;

		while (i <= 10) {

			if (i % s != 0) {

				System.out.println("   ");

			} else {

				System.out.println(i);

			}
			i++;
		}

	}

}
