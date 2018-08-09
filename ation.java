import java.util.Scanner;
public class Equation {

	public static void main(String[] args) {
  System.out.println("enter the value of a");
  Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  System.out.println("enter the value of b");
  int d= in.nextInt();
  System.out.println("enter the value of n");
  int n=in.nextInt();
  int y=0;int sum=0;
  for(int i=0;i<n;i++){
	  y=a+(i*d);
	  sum+=y;
  }System.out.println(sum);
}}
