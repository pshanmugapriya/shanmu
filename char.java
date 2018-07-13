public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c;
Scanner scan=new Scanner(System.in);
c=scan.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	System.out.println("vowel");
}
else if(c>='a'&&c<='z'&& (!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))){
	System.out.println("consonant");
}
else{
	System.out.println("invalid");
}
	}

}
