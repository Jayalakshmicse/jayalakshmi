import java.util.Scanner;


public class Normal {
	public static void main(String[] args) {
	String s;
	Scanner s1=new Scanner(System.in);
	s=s1.nextLine();
	for(int i=0;i<s.length();i++){
		
		if(s.charAt(i)=='.'){
			for(int j=i+1;j<s.length();j++){
				System.out.print(s.charAt(j));
			}
			break;
		}
				
	}

	}

}
