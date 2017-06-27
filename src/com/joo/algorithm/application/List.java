package com.joo.algorithm.application;

import java.util.Scanner;
public class List{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=0,b=0,c=0,temp=0;
		System.out.println("첫번째 수.");
		a=s.nextInt();
		System.out.println("두번째 수.");
		b=s.nextInt();
		System.out.println("세번째 수.");
		c=s.nextInt();
		
		if(b>a && b>c){
			temp=a;
			a=b;
			b=temp;
		}else if(c>a && c>b){
			temp=a;
			a=c;
			c=temp;
		}

		if(c>b){
			temp=b;
			b=c;
			c=temp;
		}
		
		System.out.printf("큰순나열: %d, %d, %d",a,b,c);
		
	}
}