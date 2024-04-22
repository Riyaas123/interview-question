package reqirement;

public class revstringwithountinbuilt {
	public static void main(String[] args) {
String str="java";
char[]ch=str.toCharArray();
int i=0;int j=str.length()-1;
String rev=" ";
for(char ch1:ch){
	
	rev=ch1+rev;
}
System.out.println(rev);
}
}