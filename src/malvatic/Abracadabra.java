package malvatic;

public class Abracadabra {
public static void main(String[] args) {
	String str="abracadabra";
	int max=0;
	char cha='a';
	int[]arr=new int[123];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>1)
		{
			if(arr[i]>max){
				max=arr[i];
				cha=(char)i;
			}
		}
	}
	System.out.println(cha);
}
}