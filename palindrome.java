public class Palindrome{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,rem=0,sum=0,temp;
		n=scan.nextInt();
		temp=n;
		for( ;n!=0; ){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(temp==sum){
			System.out.println("palindrome");
		}
		else
			System.out.println("no");
		
	}
}

		
