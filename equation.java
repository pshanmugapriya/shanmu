import java.util.Scanner;
public class Equation {

	public static void main(String[] args) {
  System.out.println("enter the value of a");
  Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  System.out.println("enter the value of b");
  int b= in.nextInt();
  System.out.println("enter the value of x");
  int x=in.nextInt();
  int y=(a*x)+b;
  System.out.println(y);
}}
