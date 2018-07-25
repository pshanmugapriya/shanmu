public class Vidharba {

	public static void main(String[] args) {
		System.out.println("enter the total number of String");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String [] a=new String[n];
		int []ar=new int[20];
		int j=0,k=0;
		int num;
		for(int i=0;i<n;i++){
			a[i]=in.next();
		}
		for(int i=0;i<n;i++){
			ar[i]=a[i].length();
		}
		int min=ar[0];
		for(int i=0;i<n;i++){
			if(ar[i]<min){
				min=ar[i];
				
			}
		}
		String e="";
		for(int i=0;i<n-1;i++){
			e="";
			char []c=a[i].toCharArray();
			char []d=a[i+1].toCharArray();
		
		for(k=0;k<min;k++){
			if(c[k]==d[k]){
				e=e+c[k];
			}
				else
					break;
			}
		min=e.length();
		}
		System.out.println(e);
		}
		

	}

