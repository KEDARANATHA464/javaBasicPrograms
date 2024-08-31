// Reverse a number
import java.util.*;
class Reverse{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int rev=0;
		while(number!=0){
			rev=rev*10+number%10;
			number=number/10;

		}
		System.out.println(rev);
	}
}