import java.util.Scanner;
public class CamelCase {
public static void main(String[] args) {
System.out.println("enter the string");
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String[] st =s.split(" ");
for(int i=0;i<st.length;i++){
	System.out.print((st[i].substring(0, 1)).toUpperCase()+st[i].substring(1)+" ");
}}}
