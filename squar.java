import java.util.*;
public class Squar {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int n=in.nextInt();
		int s=(int) Math.pow(num, n);
		System.out.println(s);

	}

}
