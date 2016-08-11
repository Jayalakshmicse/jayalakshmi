package Handson2;

public class Randomhelper {
			public static int randInt(int a,int b){
			return (int)(Math.random()*(b-a)+1)+a;
			}
			public static double randDouble(double a,double b){
				return Math.random()*(b-a)+a;
			}
	


	public static void main(String[] args) {
System.out.println(Randomhelper.randInt(1,10));
System.out.println(Randomhelper.randDouble(1,10));

	}}

}


	

}
