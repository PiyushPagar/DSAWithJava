package com.example.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int temp;
		Scanner sc =new Scanner(System.in);
		int totalNo=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=1;i<=totalNo;i++) {
			temp=b;
			b=a+b;
			a=temp;
			System.out.print(" "+b);
		}
		;
	}

}
