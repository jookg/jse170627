package com.joo.algorithm.member;

import java.util.Scanner;
public class Login{
	public static final String USER_ID="joo";
	public static final String USER_PW="1";
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("로그인\n");
		
		System.out.print("ID\n");
		String id=s.next();
		
		String result="";
		
		/*if(id.equals(USER_ID)){
			System.out.print("PW\n");
			String pw=s.next();
		
			if(pw.equals(USER_PW)){
				result="로그인 되었습니다";
			}else{
				result="비밀번호가 틀렸습니다";
			}
		}else{
			result="아이디가 없습니다";
		}*/
		System.out.print("PW\n");
		String pw=s.next();
		
		if(!id.equals(USER_ID)){
			result="아이디가 없습니다";
		}else if(pw.equals(USER_PW)){
			result="로그인 되었습니다";
		}else{
			result="비밀번호가 틀렸습니다";
		}
		System.out.print(result);
	}
}