public class Sade{

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner scan=new Scanner (System.in);
		int n,i=0,j=0,q,count=0;
		n=scan.nextInt();
	    q=scan.nextInt();
	    for(i=n;i<=q;i++){
	    	for(j=2;j<i;j++){
	    		if(i%j==0){
	    			count=0;
	    			break;
	    		}
	    		else{
	    			count=1;
	    			}
	    	}
	    		if(count==1){
	    			System.out.println(i);
	    		}
	    		
	    }
	}
}
