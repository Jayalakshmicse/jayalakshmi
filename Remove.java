import java.util.Scanner;


public class Remove {
	public static void main(String[] args) {
	Scanner s=new  Scanner(System.in);
	System.out.println("enter the no:");
	int[] m=new int[4];
	for(int i=0;i<m.length;i++)
	{
		m[i]=s.nextInt();
	}
	System.out.println("enter del  no");
	int s1=s.nextInt();
	int flag=0;
	for(int i=0;i<m.length;i++){
		if(m[i]==s1)
		{
			m[i]=m[i+1];
			for(int j=i+1;j<m.length-1;j++){
				m[j]=m[j+1];
			}
			m[m.length-1]=0;
		}
	}
	for(int i=0;i<m.length;i++){
		System.out.println(m[i]);
	}
	}

}
