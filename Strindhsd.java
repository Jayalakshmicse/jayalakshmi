package handson1;

import java.util.Scanner;

public class Strindhsd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
	char[] s2=s1.toCharArray();
	char s3 = 0;
	for(int i=0;i<s2.length;i++){
		s3=s2[i];
	System.out.println(s3);
	}
	if(s3>=65&& s3<=90 ||s3>=97 && s3<=122){
		System.out.println("false"+s3);
	}
	else
	{
		System.out.println("true:");
	}
	}
}
