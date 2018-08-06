package integervalue;
import java.util.Scanner;
public class Charint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string");
Scanner in=new Scanner(System.in);
String s=in.nextLine().toLowerCase();
int l=s.length();
System.out.println("enter the string");
String ss=in.nextLine().toLowerCase();
int len=ss.length();
byte ch1[]=s.getBytes();
byte ch2[]=ss.getBytes();
	if(l==len){
	for(int i=0;i<s.length();i++)
	System.out.print((char) ((ch1[i]+ch2[i])-95)+"");
	}
}
		

	}

