public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch;
Scanner scan=new Scanner(System.in);
c=scan.next().charAt(0);
if(ch<1 && ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	System.out.println("vowel");
}
else if(ch<1 && ch>='b'&& ch<='z'){
	System.out.println("consonant");
}
else{
	System.out.println("invalid");
}
	}

}
