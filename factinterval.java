public class Fact{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,i=0,fact=1;
		n=scan.nextInt();
	    for(i=1;i<=n;i++){
	    	fact=fact*i;
	    }
	    System.out.println(fact);
	}
}
