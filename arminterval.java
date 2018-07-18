public class Armnum{

	public static void main(String[] args) {
		System.out.println("enter the two numbers");
		Scanner scan=new Scanner(System.in);
		 int n,n1;
		 n=scan.nextInt();
		 n1=scan.nextInt();
		 

	        for(int i = n + 1; i < n1; i++) {
	            int digits = 0;
	            int result = 0;
	            int originalNumber = i;

	            
	            while (originalNumber != 0) {
	                originalNumber /= 10;
	                ++digits;
	            }

	            originalNumber = i;

	          
	            while (originalNumber != 0) {
	                int remainder = originalNumber % 10;
	                result += Math.pow(remainder, digits);
	                originalNumber /= 10;
	            }

	            if (result == i)
	                System.out.print(i + " ");
	        }
	}
}
