public class Factorial{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,i;
		n=scan.nextInt();
		int fact=1;
        if(n<=20){
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		
	}
	System.out.println(fact);
}
}

