package ibm;

public class sumofoddnos {
public static void main(String[] args) {
	int sum=0;
	int no=2514795;
	while(no!=0)
	{
		int rem=no%10;
		if(no%2==1)
		{
			sum=sum+rem;
			
		}
		no=no/10;
	}
	System.out.println(sum);
}
}