package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int N=sc.nextInt();
		int X=sc.nextInt();
		int A[];
		A= new int[N];
		for(int i=0; i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<A.length;i++) {
			if(A[i]<X) {
				System.out.print(A[i]+" ");
			}
		}
		
		
		
//		int x= sc.nextInt();
//		int n=sc.nextInt();
//		int []a=new int[n];
//		
//		for(int i=0;i<a.length;i++) {
//			
//			
//		}

	}

}
