package pro;
import java.util.Arrays;
import java.util.Scanner;
public class Knumber {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
            int len=String.valueOf(n).length();
            int m[]=new int[len];
			System.out.println("enter k value:");
			int k=s.nextInt();
			int i=0;
			while(n!=0) {
				m[i]=n%10;
				n=n/10;
				i++;
			}
			Arrays.sort(m);
			
			int m1[]=new int[m.length-k];
			String s1="";
			for(int j=0;j<m.length-k;j++){
				m1[j]=m[j];
				s1+=m1[j];
			}
			System.out.println(s1);
			}

	}


