public class Shanmu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of the array:");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[]a=new int[size];
		int b=0,count=0;
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<size;i++){
			b=a[i];
			for(int j=i+1;j<size;j++){
				if(b==j){
				System.out.print(a[i]+" ");
					count=b;
					break;
				}
			}
		}
		if(count==0){
			System.out.println("unique");
		}
	}

}
