package Assign1;

public class Encrypt {
	public static void main(String[] args) {
		String s="deepsa";
		int s2=s.length();
		char[] n=new char[s2];
		for(int i=0;i<s2-1;i++){
			int x=((int)s.charAt(i))-1;
			if(x==96){
				x+=26;
			}
			n[i]=(char)x;
		}
		n[s2-1]=s.charAt(s2-1);
		for(int i=0;i<s2;i++){
			System.out.print(n[i]);
		}

	}

}
