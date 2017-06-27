package com.joo.algorithm.calculator;

import java.util.Scanner;
public class calculator2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("숫자\n");
		int a=s.nextInt();
		System.out.print("연산기호\n");
		String opcode=s.next();
		System.out.print("숫자\n");
		int c=s.nextInt();
		int result=0;
		if(opcode.equals("+")){
			result = a+c;
			
		}else if(opcode.equals("-")){
			result = a-c;
		}else if(opcode.equals("*")){
			result = a*c;
		}else{
			result = a/c;
		}
		System.out.print(String.format("%d %s %d = %d",a,opcode,c,result));
		
	}
}