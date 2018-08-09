import java.util.Scanner;
public class Kthdigit {

	public static void main(String[] args) {
	System.out.println("enter the size");
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
System.out.println("enter the value of k");
int k=in.nextInt();
int[]s=new int[a];
for(int i=0;i<a;i++){
	s[i]=in.nextInt();
}
System.out.println(s[k-1]);
}}
