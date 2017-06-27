package com.joo.algorithm.matrix;

public class MrSmith{
	public static void main(String[] args){
		//String[][] mtx=new String[4][5];
		//for(int i=0;i<4;i++)
		String[][] mtx={
			{"morning","afternoon","evening","bye"},
			{"Mr.","Mrs.","Miss","My"},
			{"Smith","Alex","John","James"}
		};
		System.out.print(mtx[0][1]+"\t"+mtx[1][1]+"\t"+mtx[2][1]);
	}
}