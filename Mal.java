import java.util.Scanner;


public class Mal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.next();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=s1.toString();
		System.out.println(s2);
		s.close();
	}

}
