public class Armstrongnum{

	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner scan=new Scanner (System.in);
		int n,rem,sum=0,temp;
		n=scan.nextInt();
		temp=n;
		while(n!=0){
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum){
			System.out.println("yes");
		}
		else
			System.out.println("no");
		}
}
