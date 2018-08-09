import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[N];
		int i=0;
		for(i=0;i<N;i++){
			a[i]=in.nextInt();
		}System.out.println(a[k-1]);

	}

}
