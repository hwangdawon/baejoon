package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i =0; i<a; i++) {
			for(int j =a-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
