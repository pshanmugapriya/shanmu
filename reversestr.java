public class Reverse{

	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner scan=new Scanner (System.in);
		String s;
		s=scan.next();
		String reverse=new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
	}
}
