package milestone3;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter n numbers:");
		int n=s.nextInt();
		int a=-1,b=1,c=0;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;b=c;
			System.out.println(c);
			s.close();
		}

	}

}
