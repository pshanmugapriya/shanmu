public class Ballon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string of x:");
Scanner in=new Scanner(System.in);
String x=in.next();
System.out.println("enter the value of y:");
String y=in.next();
int x1=x.length();
int y1=y.length();int max,min,count=0,d=0;
if(x1>y1){
	max=x1;
	min=y1;
}
else{
	max=y1;
	min=x1;
}
char c[]=x.toCharArray();
char c1[]=y.toCharArray();
for(int i=0;i<min;i++){
	if(c[i]==c1[i]){
		count++;
	}
	 d=max-count;
}System.out.println(d);
	}

}
