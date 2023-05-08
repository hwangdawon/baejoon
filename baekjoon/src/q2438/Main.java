package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int c =sc.nextInt();
		sc.close();
		
//		System.out.println(c);
		
		for(int i =0; i<c; i++){
			for(int j =0; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int a = 1; a>=1 && a<=100;a++) {
//			
//			System.out.println("*");
//			
//			for(int b = 1; b<=a;b++) {
//				
//				System.out.println("**");
//			}
//		}

	}

}
