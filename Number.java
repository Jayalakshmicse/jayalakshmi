package pro;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int m=n;
		int n1=0;
		int sb=0;
		while(n!=0)
		{
			n1=n%10;
			n=n/10;
			m=m*n1;
			
		}
		System.out.println(m);
	}

}
