package com.joo.algorithm.calculator;

/*
To.개발자님
연도를 4로 나눈값이 0이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
예시)2000년과 2016년을 입력하면 윤년으로 나옴
*/

import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("연도:");
		int year = s.nextInt();
		String result="";
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					result="윤년";
				}else{
					result="평년";
				}
			}else{
				result="윤년";
			}
		}else{
			result="평년";
		}
		
		System.out.print(result);
	}
}