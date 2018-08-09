import java.util.*;
import java.util.ArrayList;
public class Reve {
      public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
    	      int n=in.nextInt(),a[]=new int[n],b[]=new int[n],i,c[]=new int[n];;
    	      for( i=0;i<n;i++)
    	      {
    	          a[i]=in.nextInt();
    	      }for( i=0;i<n;i++)
    	      {
    	  c[i]=a[i];    }
    	      
    	      Arrays.sort(a);
    	      for(i=0;i<n;i++)
    	      {
    	          b[i]=a[i];
    	      }
    	       for(i=0;i<n;i++)
    	      {
    	          if(a[i]!=c[i]){
    	       System.out.println(i+1);
    	              break;
    	          }    }
    	      }
    	  }
