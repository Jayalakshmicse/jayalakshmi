import java.util.Scanner;


public class Expo {
	public static void main(String[] args) {
     int n;
   Scanner s=new Scanner(System.in);
    n=s.nextInt();
     int a=0;
     int sum=0;
     int ln=0;
     int number=n;
     while(number>0)
     {
    	 number=number/10;
    	 ln++;
     }
     int num=n;
     for(int i=ln;i>0;i--){
    	 a=num%10;
    	  num=num/10;
    	  int l=ln;
    	  int b=1;
     while(l>0){
    	 b=b*a;
    	 l--;
     }
     sum=sum+b;
     
     }
	System.out.println(sum);	
	s.close();
	}


	}


