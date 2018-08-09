import java.util.Scanner;
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value of p,t,r");
Scanner in=new Scanner(System.in);
double p=in.nextInt();
double t=in.nextInt();
double r=in.nextInt();
double si=(p*t*r)/100;
System.out.println(si);
	}

}
