package com.joo.algorithm.grade;

import java.util.Scanner;
public class GradeReport2{
	public static void main(String[] args){
		
		// name, kor, eng, math
		// total, avg
		// 아무개 : B
		//definition
		Scanner s = new Scanner(System.in);
		int kor=0, eng=0, math=0, total=0, avg=0;
		String result="",grade="";
		//input
		System.out.println("이름");
		String name = s.next();
		System.out.println("국어");
		kor = s.nextInt();
		System.out.println("영어");
		eng = s.nextInt();
		System.out.println("수학");
		math = s.nextInt();
		//operation
		total = kor+ eng + math;
		avg = (kor + eng + math)/3;
		/*
		if(avg>89){
			result = "A";
		}else if(avg>79){
			result = "B";
		}else if(avg>69){
			result = "C";
		}else if(avg>59){
			result = "D";
		}else{
			result = "E";
		}
		          avg/10    */  
		switch((int) (avg*0.1)){
			case 10:
			case 9:
				grade="A";
			break;
			case 8:
				grade="B";
			break;
			case 7:
				grade="C";
			break;
			case 6:
				grade="D";
			break;
			case 5:
				grade="E";
			break;
			default:
				grade="F";
			break;
		}
		
		System.out.println("*****************************");
		System.out.println("  이름    총점   평균   등급");
		System.out.println("------------------------------");
		System.out.print(String.format("|  %s  |  %d  |  %d  |  %s  |\n",name,total,avg,grade));
		System.out.print("*****************************");
	}
}