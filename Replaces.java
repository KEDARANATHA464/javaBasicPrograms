// String apples a Replace with the p
// i/p = apples
// o/p = paales
class Replaces{
	public static void main(String[] args){
		String Original="apples";
		String temps=Original.replace('a','@');
		temps= temps.replace('p', 'a');
		String finals=temps.replace('@','p');
		System.out.println("original :"+Original);
		System.out.println("final :"+finals);
	}
}