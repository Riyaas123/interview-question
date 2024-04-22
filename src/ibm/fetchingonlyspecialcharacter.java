package ibm;

public class fetchingonlyspecialcharacter {
public static void main(String[] args) {
	String str="aaa234bc@sad$hsagd^";
	String a=str.replaceAll("[a-zA-Z0-9]","");
	System.out.println(a.length());
	}
}
