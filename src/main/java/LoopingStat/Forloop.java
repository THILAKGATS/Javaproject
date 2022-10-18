package LoopingStat;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter, How many do you needed");
		int n = scan.nextInt();		
		
		for(int i=0;i<=n;i++)
		{
			System.out.print("*");
		}

	}

}
