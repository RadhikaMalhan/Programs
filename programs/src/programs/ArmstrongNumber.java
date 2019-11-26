package programs;

public class ArmstrongNumber {
 //153 then we get cube every digit 1*1*1=1
	//5*5*5=125
	//3*3*3=27
	//thus 125+27+1=153
	public static void isArmstrongNumber(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("this is armstrong number");
		}
		else {
			System.out.println("this is not armstrong number");
		}
	}
	public static void main(String[] args) {
	
      isArmstrongNumber(153);	
	}
}
