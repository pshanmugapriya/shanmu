import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		if(num%2==0){
			System.out.println(num/2);
		}else{
			System.out.println(num);
		}
	}

}
