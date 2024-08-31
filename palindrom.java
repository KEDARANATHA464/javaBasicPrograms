//palindrom

class palindrom{
	public static void main(String[] args){
		int number=16461;
		int original_num=number;
		int rev=0;
		while(number!=0){
			rev=rev*10+number%10;
			number=number/10;
		}
		if(original_num==rev){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrom");
		}
	}
}