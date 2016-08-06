
public class Sum1 {
	

	public static int output1;
	static int x=0;
	public static void main(String[] args) {
		Sum1 s=new  Sum1();
s.userMethod(9876);
System.out.println(output1);
	}
	public  void userMethod(int input1){
		int y=input1;
		
		while(y!=0){
			x+=y%10;
			y=y/10;
		}
		input1=input1/10;
		if(input1 >0){
			userMethod(input1);
		}
		output1=x;
	}

}
