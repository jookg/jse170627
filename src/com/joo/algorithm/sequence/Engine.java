package com.joo.algorithm.sequence;

import java.util.Scanner;
public class Engine{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("0.종료 1.시작 ");
			String menu=s.next();
			switch(menu){
				case "0": 
					System.out.println("종료");
				return;
				case "1": 
					System.out.println("시작");
				break;
			}
		}
	}
}