public class Kdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value of n:");
Scanner in =new Scanner(System.in);
int n=in.nextInt();
System.out.println("enter the value of k:");
int k=in.nextInt();
String a=Integer.toString(n);
String c="";
for(int i=k;i<a.length();i++){
	c+=a.substring(i, i+1);
}
System.out.println(c);

}
	}


