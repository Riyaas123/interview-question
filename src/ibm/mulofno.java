package ibm;

public class mulofno {
public static void main(String[] args) {
	int mul=1;
	int no=2342;
	while(no!=0)
	{
		int rem=no%10;
		mul=mul*rem;
		no=no/10;
	}
	System.out.println(mul);
}
}
