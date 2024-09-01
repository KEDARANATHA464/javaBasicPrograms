class sub{
	int data1;
	int data2;
	 public void getsub(){
	 	System.out.println(data1-data2);
	 }
	 public int sub1(int num1,int num2){
	 	return num1-num2;
	 }
}
class Substraction{
	public static void main(String args[]){
		sub objsubs=new sub();
		objsubs.data1=20;
		objsubs.data2=10;
		objsubs.getsub();

		int sub4=objsubs.sub1(6,2);
		System.out.println(sub4);

	}
	
}