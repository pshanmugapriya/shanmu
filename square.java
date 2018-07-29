public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number:");
Scanner in=new Scanner(System.in);
long n=in.nextInt();
 long sum=0,rem;
while(n!=0){
	rem=n%10;
	sum=sum+(rem*rem);
	n=n/10;
}
System.out.println(sum);
	}

}
