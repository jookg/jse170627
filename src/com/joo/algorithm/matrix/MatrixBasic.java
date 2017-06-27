package com.joo.algorithm.matrix;

public class MatrixBasic{
	public static void main(String[] args){
		int[][] mtx=new int[4][5];
		for(int i=0;i<mtx.length;i++){
			for(int j=0;j<mtx[i].length;j++){
				//mtx[i][j]=i+","+j;
				System.out.print("["+i+","+j+"]\t");
			}
			System.out.println();
		}
	}
}