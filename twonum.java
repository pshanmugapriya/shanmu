public class Sghj {


public static void main(String[] args) {

int N,k;
Scanner scan=new Scanner(System.in);
N=scan.nextInt();
k=scan.nextInt();
int sum=0;
int [] a=new int[N];
//system.out.println(a.length);
for(int i=0;i<a.length;i++){
	a[i]=scan.nextInt();
	//system.out.println(a[i]);
}
for(int i=0;i<k;i++){
	sum=sum+a[i];
}
System.out.println(sum);
}
}
