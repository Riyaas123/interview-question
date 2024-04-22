package ibm;

import java.util.Arrays;

public class betweenthenos {
public static void main(String[] args) {
	int[]arr={29,38,12,48,39,55};
	int a=30;
	int b=50;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>a && arr[i]<b)
		System.out.println(arr[i]);
	}
}
}
