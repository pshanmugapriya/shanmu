import java.util.Scanner;
public class Sums {

	public static void main(String[] args) {
System.out.println("enter the size");
Scanner in=new Scanner(System.in);
int N=in.nextInt();
int[] n=new int[N];
int temp=0;
for(int i=0;i<N;i++){
	n[i]=in.nextInt();
	temp+=n[i];
}
System.out.println(temp);
}}
