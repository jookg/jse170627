package com.joo.algorithm.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int year=0, gap=0;
		String gender="",name="",ssn="",sYear;
		
		System.out.println("이름을 입력하세요.");
		name=s.next();
		System.out.println("주민등록번호를 입력하세요.");
		ssn=s.next();
		sYear=ssn.substring(0,2);
		year=Integer.parseInt(sYear);
		gap=17-year;
		
		char ch = ssn.charAt(7);
		switch (ch){
			case '1':
			case '3':
				gender = "남자";
				break;
			case '2':
			case '4':
				gender = "여자";
				break;
			case '5':
			case '6':
				gender = "외국인";
				break;
			default:
				gender = "잘못입력";
				break;
		}
		System.out.println("*****************");
		System.out.println(" 이름  나이  성별");
		System.out.println("-----------------");
		System.out.println(String.format("  %s   %d   %s",name,(gap>=0)? 17-year+1 : 117-year+1,gender));
		System.out.println("*****************");
		//**************
		//이름 나이 성별
		//--------------
		//홍길동 20세 남
		//**************
		
	}
}