package ibm;

public class highestnos {
public static void main(String[] args) {
	int no=32387634;
	int high=0;
	while(no!=0){
		int rem=no%10;
		if(high<rem){
			high=rem;
		}
		no=no/10;
	}
	System.out.println(high);
}
}