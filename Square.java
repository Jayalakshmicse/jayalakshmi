package pack;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		int a=0,b=0;
		while(n!=0){
			a=n%10;
			n/=10;
			b+=a*a;
		}
		System.out.println(b);
		c.close();
	}

}
