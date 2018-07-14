public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
Scanner scan=new Scanner(System.in);
int number,n,rem=0,sum=0;
number=scan.nextInt();
for(int i=0;i<number;i++){
	rem=number-i;
	sum=sum+rem;
	
}
System.out.println(sum);
	}

}
