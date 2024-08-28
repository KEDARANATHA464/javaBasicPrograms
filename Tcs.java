// calculate the sum of the 10 multiples of n{TCS}
// i/p :10 
//o/p :550
import java.util.*;
class Tcs{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int sum=0;
		while(i <=10){
			sum=sum+(n*i);
			i++;
		}
		
		System.out.println(sum);
	}
}