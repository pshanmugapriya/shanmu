import java.util.Arrays;
import java.util.Scanner;
public class Rev {

	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
        int[] a=new int[n];
        int b[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=in.nextInt();
    }
    Arrays.sort(a);
   String ss= Arrays.toString(a);
       for(int j=0;j<n;j++){
    	   b[j]=in.nextInt();
    	   }
       Arrays.sort(b);
      String s= Arrays.toString(b);
        
      if(ss.equals(s)){
    	  System.out.println("yes");
      }else{
    	  System.out.println("no");
      }
        }
	}
