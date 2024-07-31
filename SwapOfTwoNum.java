import java.util.*;
class SwapOfTwoNum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two value");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a;
		a=b;
		b=c;

		System.out.println("Swap of number a is"+a);
		System.out.println("Swap of number b is"+b);
			}
}