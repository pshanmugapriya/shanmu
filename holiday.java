public class Holiday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the day:");
Scanner in=new Scanner(System.in);
String day=in.next().toLowerCase();
//System.out.println(day);
if(day.equals("monday") ||day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")){
	System.out.println("no");
}else if(day.equals("sunday") || day.equals("saturday")){
	System.out.println("yes");
}else
	System.out.println("invalid day");
	}}
