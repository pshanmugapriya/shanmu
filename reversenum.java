public class Sade{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,rem=0,sum=0;
		n=scan.nextInt();
		while(n!=0){
			rem=n%10;
		
			n=n/10;
			
			System.out.print(rem);
		}
		
}
}
