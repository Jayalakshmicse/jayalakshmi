import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int  d=0;
		while(n!=0){
			int a=n%10;
			n/=10;
			System.out.println();
			if(a%2!=0){
				d+=a;
				System.out.println(d);
		}
		}
		if(d%2!=0){
			System.out.println(1);
		}
		else{
			System.out.println(-1);
		}
		}

	}


