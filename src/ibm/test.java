package ibm;

import java.util.Arrays;

public class test {
public static void main(String[] args) {
	int []arr={9,-3,2,-6,-7,8,10};
	Arrays.sort(arr);
	int sum=arr[arr.length-1]+arr[arr.length-2];
	System.out.println(sum);
			}
}
