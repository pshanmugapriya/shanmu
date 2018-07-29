public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the size of the string");
Scanner scan=new Scanner(System.in);
int l=scan.nextInt();
String s=scan.next();
int len=s.length();
if(l==len){
	String d=s.replaceAll("[a,e,i,o,u]","");//System.out.println(d);
	String a=new StringBuffer(d).reverse().toString();
	System.out.println(a);
}

	}

}
