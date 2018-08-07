import java.util.Scanner;
public class Cuboid {

	public static void main(String[] args){
System.out.println("enter the values");
Scanner in=new Scanner(System.in);
int l=in.nextInt();
System.out.println("enter the values");
int b=in.nextInt();
System.out.println("enter the values");
int h=in.nextInt();
int sa=(2*l*b)+(2*b*h)+(2*l*h);
System.out.println(sa);
int v=l*b*h;
System.out.print(v);

	}

}
