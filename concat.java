public class StringConcat{

	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner scan=new Scanner (System.in);
		String s1,s2,stl;
		s1=scan.next();
		s2=".";
		stl=s1.concat(s2);
		System.out.println(stl);
		}
}
