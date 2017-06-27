package com.joo.algorithm.grade;

import java.util.Scanner;
public class Rangking{
	public static void main(String[] args)
	{	
		System.out.println("성적랭킹");
		Scanner s=new Scanner(System.in);
		int[] arr=new int[3];
		String[] arr2=new String[3];
		for(int i=0;i<3;i++){
			System.out.println("이름를 입력하세요");
			arr2[i]=s.next();
			System.out.println("점수를 입력하세요");
			arr[i]=s.nextInt();
		}
		int big=0;
		String big2="";
		
		
		if(arr[1]>arr[0] && arr[1]>arr[2]){
			big=arr[0];
			arr[0]=arr[1];
			arr[1]=big;
			
			big2=arr2[0];
			arr2[0]=arr2[1];
			arr2[1]=big2;
			
		}else if(arr[2]>arr[0] && arr[2]>arr[1]){
			big=arr[0];
			arr[0]=arr[2];
			arr[2]=big;
			
			big2=arr2[0];
			arr2[0]=arr2[2];
			arr2[2]=big2;
		}
		if(arr[2]>arr[1]){
			big=arr[1];
			arr[1]=arr[2];
			arr[2]=big;
			
			big2=arr2[1];
			arr2[1]=arr2[2];
			arr2[2]=big2;
		}
		
		System.out.printf("랭킹: 1등 %s %d, 2등 %s %d, 3등 %s %d",arr2[0],arr[0],arr2[1],arr[1],arr2[2],arr[2]);
	}
}