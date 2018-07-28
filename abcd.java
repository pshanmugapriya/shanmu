public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the String");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String []str=s.split(" ");
		int l=str.length;
		int i,count=0,flag=0,j,count1=0,flag1=0;
		char ch[]=str[0].toCharArray();
		char c[]=str[1].toCharArray();
		if(ch.length==c.length){
		   for(i=0;i<ch.length-1;i++){
			   if(ch[i]==ch[i+1]){
				   count++;
			 }
			   else{
				   flag=0;
				   
			   }}
			   for(j=0;j<c.length-1;j++){
				   if(c[j]==c[j+1]){
					   count1++;
					 
				   }else{
					   flag1++;
					   } } }
		   if(flag1>1){
			   System.out.println("no");
			   
		   }else{
			   
			   System.out.println("yes");
			   
		}
			}

		}
