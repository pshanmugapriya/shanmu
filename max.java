import java.util.Scanner;
public class Maxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int max=sc.nextInt();
        int i;
		for(i=1;i<size;i++){
		       int min =sc.nextInt();
		   if(max<min)
		    	max=min ;
		    }
			System.out.println(max);
	}
}
