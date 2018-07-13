
public class Poyh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("enter the number");
Scanner scan=new Scanner(System.in);
int i=0,j=0;
//n=scan.nextInt();
int[] a=new int[3];
int max=a[0];
for(i=0;i<3;i++){
	a[i]=scan.nextInt();
}
for(j=0;j<3;j++){
	if(a[j]>max){
		max=a[j];
	}
}
System.out.println(max);
}
}
