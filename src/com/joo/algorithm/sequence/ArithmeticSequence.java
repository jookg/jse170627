package com.joo.algorithm.sequence;

import java.util.Scanner;
public class ArithmeticSequence{
	public static void main(String[] args)
	{	
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		for(int i=1; i<10;i++){
			for(int j=a; j<10; j++)
			{
			System.out.printf("%d*%d=%d \t",j,i,i*j);
			}
			System.out.println();
		}
	}
}