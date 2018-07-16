public class Prime{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,i=0,count=0;
		n=scan.nextInt();
		for( i=2;i<n/2;i++){
			
			if(n%i==0){
				count++;
			}
		}
		if(count>1)
			System.out.println("no");	
			
			else{
				System.out.println("yes");
			}
		}

}
