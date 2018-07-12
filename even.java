public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("enter the number:");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
if(n>0 && n%2==0){
	System.out.println("even");
	
}
else if(n>0 && n%2==1){
	System.out.println("odd");
	
}
else
	System.out.println("INVALID");
	}

}
