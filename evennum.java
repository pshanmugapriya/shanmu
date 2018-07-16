public class Sade{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,i=0,q;
		n=scan.nextInt();
        q=scan.nextInt();
        if(n<100000 && q<100000){
        	for(i=n+1;i<q;i++){
        		if(i%2==0)
        		System.out.println(i);
        	}
        }

		}

}

