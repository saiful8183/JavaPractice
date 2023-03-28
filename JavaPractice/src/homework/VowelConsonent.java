package homework;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

	System.out.print("Enter first test score");
	int score1 = scan.nextInt();

	System.out.print("Enter second test score");
	int score2 = scan.nextInt();

	System.out.print("Enter third test score");
	int score3 = scan.nextInt();

	System.out.print("Enter fourth test score");
	int score4 = scan.nextInt();

	System.out.print("Enter fifth test score");
	int score5 = scan.nextInt();

	int total = score1 + score2 + score3 + score4 + score5;
int average=total/5;

	if(average>=93)
	{
		System.out.printf("Your average was :%f and received an A in this class", average);

	}else if(average>=85)
	{
		System.out.printf("Your average was :%f and received a B in this class", average);

	}else if(average>=70)
	{
		System.out.printf("Your average was :%f and received a C in this class", average);

	}else if(average>=60)
	{

		System.out.printf("Your average was :%f and received a D in this class", average);

	}else
	{
		{
			System.out.printf("Your average was :%f and received a F in this class", average);

		}

	}

		
		

	}
}
