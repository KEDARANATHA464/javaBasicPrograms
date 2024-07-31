import java.util.*;
class postiveOrNegative{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int number=s.nextInt();
		if(number>=0){
			System.out.println(number+":number is postive");
		}
		else{
			System.out.println(number+":number is Nagative");
		}


	}
}