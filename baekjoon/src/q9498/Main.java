package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		int num = ab.nextInt();
		   ab.close();
	   // if else
		   if(90<=num && num<=100) {
			   System.out.println("A");
		   }else if(80<=num && num<=89) {
			   System.out.println("B");
		   }else if(70<=num && num<=79) {
			   System.out.println("C");
		   }else if(60<=num && num<=69) {
			   System.out.println("D");
		   }else {
			   System.out.println("F");
		   }
		   
		   //if else2
		   if(90<=num && num<=100) {
			   System.out.println("A");
		   }else if(80<=num ) {
			   System.out.println("B");
		   }else if(70<=num) {
			   System.out.println("C");
		   }else if(60<=num) {
			   System.out.println("D");
		   }else {
			   System.out.println("F");
		   }
		   //switch case
		   int s = num / 10;
		   switch(s) {
		   case 10:
		   case 9:   
			   System.out.println("A");
		   case 8:
			   System.out.println("B");
		   case 7:
			   System.out.println("C");
		   case 6:
			   System.out.println("D");
		   default:
				System.out.println("F");
		   }
	}

}
