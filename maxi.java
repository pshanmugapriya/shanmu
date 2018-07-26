import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int count=0,count2=n-1;
			System.out.println("enter the numbers:");
			int a[]=new int[n];
			int b[]=new int[n];
			for( int i = 0; i < n; i++) {
				a[i]=s.nextInt();
			}
			Arrays.sort(a);
			for(int j=n-1;j>=0;j--){
				b[j]=a[j];//System.out.println(b[j]);
			}
			for( int i = 0; i < n; i++) {
				if(i%2!=0) {
				System.out.println(b[count]);
				count=count+1;
				}
				else {
					System.out.println(b[count2]);
					count2=count2-1;	}}}}
