package malvatic;

public class palindrome {
public static void main(String[] args) {
	String str="I want to Learn MalaYalam but i am from KataK it is in Gadag district";
	str=str.toLowerCase();
	String[]ss=str.split(" ");
	for(String s:ss){
		pali(s);
}
}
static void pali(String str){
	String rev="";
	for(int i=0;i<str.length();i++)
	{
		rev=str.charAt(i)+rev;
	}
	if(rev.equals(str))
	{
		System.out.println(str);
	}
}
}