import java.util.Scanner;
public class Reve {
      public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt(),sum=1,rem;
		while(num!=0){
			rem=num%10;
			sum*=rem;
			num=num/10;
		}
		System.out.print(sum);
		
      }}
