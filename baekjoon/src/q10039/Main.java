package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int sum=0;
		int num=0;
		for(int i=0;i<5;i++) {
			 num=sc.nextInt();
			
			if(num<=40) {
				num=40;
			}
			sum+=num;
			
		}
		System.out.println(sum/5);
		

	}

}
