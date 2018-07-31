import java.util.Arrays;
import java.util.Scanner;
public class Lex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string:");
Scanner in=new Scanner(System.in);
String s=in.next();char s1[]=s.toCharArray();
char[] c=s.toCharArray();
Arrays.sort(c);
int l=c.length,count=0,count1=0,i=0;
char h=c[c.length-1];
for(int j=0;j<s1.length;j++){
	if(h==s1[j]){
	System.out.println(s.substring(j));
	}}}}


