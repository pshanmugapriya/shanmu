
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("enter the number:");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
if(n>=1 && n<=100000){
	System.out.println("positive");
	
}
else if(n<=0){
	System.out.println("negative");
	
}
else
	System.out.println("zero");
	}

}
