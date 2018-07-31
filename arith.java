import java.util.Scanner;
public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value of n");
Scanner in=new Scanner(System.in);
int n=in.nextInt();
System.out.println("enter the value of a:");
int a=in.nextInt();
System.out.println("enter the value of d");
int d=in.nextInt();
int sum=0;
for(int i=n;i>=0;i--){
	sum=sum+(a+((i-1)*d));
}System.out.println(sum);
	}

}
