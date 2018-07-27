import java.util.Arrays;
import java.util.*;
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the size of the number:");
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int []a=new int[n];
int []b=new int[n];
int count=0;
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
Arrays.sort(a);
for(int j=n-1;j>=0;j--){
	b[j]=a[j];
System.out.print(b[j]);
	}
}}
