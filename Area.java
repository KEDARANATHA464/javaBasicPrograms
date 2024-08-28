// To find the Area of Trinagle a=0.5*b*h
import java.util.*;
class Area{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of Height and Breadth value:");
		int Height= s.nextInt();
		int Breadth= s.nextInt();
		float Area=0.5f*(Breadth* Height);
		System.out.println(Area);
	}
	
}