public class Roman {

	public static void main(String[] args) {
		System.out.println("enter the roman:");
		 int sum=0; int b=0;int count1=0; int count=0;
         String s;
         int c[]=new int[100];
         Scanner ss=new Scanner(System.in);
         s=ss.next();
         char a[]=s.toCharArray();
         int l=s.length();
         
         for(int i=0;i<l;i++){
             switch(a[i]){
                 case'I':
                 b=1;
                 break;
                 case'V':
                 b=5;
                 break;
                 case'X':
                 b=10;
                 break;
             }
             c[count1]=b;
             count1++;
             count++;
         }
         count1=0;
        
         int f=c[count1];
         int ll=c[count-1];
        
         if(f>ll||f==ll){
            for(int i=0;i<count;i++){
                sum=sum+c[i];
            }
             System.out.println(sum);
         }
       else{
            for(int i=count-1;i>=0;i--){
                sum=(-sum)-c[i];
                
       }
          System.out.println(sum);
}
	}
}
