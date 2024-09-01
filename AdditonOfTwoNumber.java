class add{
	int number1;
	int number2;
	public void add1(){
		System.out.println(number1+number2);
	}

	public int getNumber1(int num1,int num2){
		return num1+num2;

	}
}
class AdditonOfTwoNumber{
	public static void main(String[] args){
		add objadd=new add();
		objadd.number1=10;
		objadd.number2=20;
		objadd.add1();

		int r=objadd.getNumber1(2,4);
		System.out.println(r);
	}
}