package com.joo.algorithm.application;

import java.util.Scanner;
public class BMI{
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("체중(kg)\n");
	double kg = s.nextDouble();
	System.out.print("키(cm)\n");
	double cm = s.nextDouble();
	double bmi = kg/((cm*0.01)*(cm*0.01));
	System.out.print("나의 체질량지수(BMI): ");
	String result="";
	/*if(30<=bmi){
		result="비만";
	}else if(29.9>=bmi&&bmi>=25){
		result="과체중";
	}else if(24.9>=bmi&&bmi>=18.5){
		result="정상";
	}else{
		result="저체중";
	}*/
	if(30<=bmi){
		result="비만";
	}else if(bmi>=25){
		result="과체중";
	}else if(bmi>=18.5){
		result="정상";
	}else{
		result="저체중";
	}
	System.out.print(result);
}
}