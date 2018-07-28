public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string:");
Scanner in=new Scanner(System.in);
String s=in.next();
int l=s.length();
String sum="";
String sum1="";                                             //it is applicable only for 4 letter word
String sum2="";
String sum3="";
	sum=(s.substring(1,2));
	sum1=(s.substring(0,1));
	sum2=(s.substring(3,4));
sum3=(s.substring(2,3));
System.out.print(sum+sum1+sum2+sum3);
	}
	
	


}
