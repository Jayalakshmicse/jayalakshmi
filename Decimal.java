package pack;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toHexString(n));
		System.out.println(Integer.toOctalString(n));
		s.close();
	}

}
