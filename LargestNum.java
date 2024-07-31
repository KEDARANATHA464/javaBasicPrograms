//find the largest amounge three number
import java.util.*;
class LargestNum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the three values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b)
			System.out.println("good");{

			if(a>c){
				System.out.println("a is Largest num:" +a);
			}
		}
		eleif(b>c)
		{
			System.out.println("b is largest num"  +b);
		}
		else{
			System.out.println("c is largest num"+c);
		}

	}
}