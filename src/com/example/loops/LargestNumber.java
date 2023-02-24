package com.example.loops;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//int max=a;
//		if(max<b) {
//			max=b;
//		}
//		if(max<c) {
//			max=c;
//		}
//
//		System.out.println(max);
		
//		int max =Math.max(a, b);
		int max =Math.max(c, Math.max(a, b));
		System.out.println(max);
	
	
	//logic suppose first no is max and check second is greater or not
	// if yes then b=max
	// same for next no
	}

}
