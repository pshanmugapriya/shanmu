import java.util.ArrayList;
import java.util.*;
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value of n");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println("enter the value of k:");
int k=scan.nextInt(),a;
ArrayList<Integer> p = new <Integer> ArrayList();
for(int i=0;i<n;i++){
	a=scan.nextInt();
	p.add(a);
	
}Collections.rotate(p, k);
for(int b:p){
	System.out.println(b);
}

	}

}
