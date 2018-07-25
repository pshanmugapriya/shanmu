public class Ncost {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	String s1=rd.next().toLowerCase();
	String s2=rd.next().toLowerCase();
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	int sum=0,s,c=0,d=0;
	int sum1=0;
	 if(s1.length()<s2.length()){
		for(int i=0;i<s1.length();i++){
			s=Math.abs(a[i]-b[i]);
			sum=sum+s;
			c=i;
		      }
		  for(int j=c+1;j<s2.length();j++){
			d=s2.charAt(j)-96+d;
		      }
		         sum1=sum+d;
		   }
	 else{
		for(int i=0;i<s2.length();i++){
			s=Math.abs(a[i]-b[i]);
			sum=sum+s;
			c=i;
		       }	
		  for(int j=c+1;j<s1.length();j++){
			d=s1.charAt(j)-96+d;
		       }
			  sum1=sum+d;
		     }
	     System.out.println(sum1);
	
}
}
