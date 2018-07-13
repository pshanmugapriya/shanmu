public class Poyh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
Scanner scan=new Scanner(System.in);
char ch;
ch=scan.next().charAt(0);
if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
	System.out.println("alphabet");
	
}
else{
	System.out.println("no");
}
	}

}
