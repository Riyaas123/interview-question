package malvatic;

import java.util.*;

public class RemoveduplicateCount {
public static void main(String[] args) {
	String str="session";
	LinkedHashSet s=new LinkedHashSet();
	for(int i=0;i<str.length();i++)
	{
		s.add(str.charAt(i));
	}
	System.out.println(s.size());
}
}