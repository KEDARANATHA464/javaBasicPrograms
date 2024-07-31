import java.util.*;
class EvenOdd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		int number=s.nextInt();
		if(number%2==0){
			System.out.println("the given number "+number+" is even number");
		}
		else {
			System.out.println("the given number "+number+" is odd number");
		}
		s.close();

	}
}