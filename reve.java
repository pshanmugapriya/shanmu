import java.util.Scanner;
public class Reve {
      public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt(),rem,sum=0;
		while(num!=0){
			rem=num%10;
			num=num/10;
			System.out.print(rem);
		}}}
