public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string:");
Scanner sc=new Scanner(System.in);
int count=0,count1=0;
int m=sc.nextInt();
int n=sc.nextInt();
for(int i=m;i<=n;i++){
	for(int j=2;j<i;j++){
		if(i%j==0){
			count++;
			break;
		}
		else{
			count=0;
			}
	}
		if(count==0){
			count1++;
		}
}
System.out.println(count1);
	}
	
	


}
