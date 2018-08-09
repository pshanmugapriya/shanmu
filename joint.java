import java.util.Scanner;
public class Joint {

	public static void main(String[] args) {
		System.out.println("enter the string");
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String s=str.replaceAll(" ","");
System.out.println(s);
	}

}
