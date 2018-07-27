public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the size:");
Scanner in=new Scanner(System.in);
int size=in.nextInt();
int[]b=new int[size];
int[]c=new int[size];
int i=0,count=0,count1=0;
for(i=0;i<size;i++){
	b[i]=in.nextInt();
	//System.out.println(b[i]);
}
for(i=0;i<size;i++){
	count=0;
	for(int j=0;j<size;j++){
		if(i!=j){
		if(b[i]!=b[j]){
			count++;
		}
		else{
			count=0;
			break;
		}
	}
	}

if(count>=1){
	
	System.out.print(b[i]+" ");
}

}
}
	}
