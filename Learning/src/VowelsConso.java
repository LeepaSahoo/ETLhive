import java.util.HashMap;
import java.util.Map;

public class VowelsConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I am learning java";
String str= s.toLowerCase();
char[] ch=str.toCharArray();
HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
	for (char c:ch)
	{
		if(hm.containsKey(c))
		{
			hm.put(c,hm.get(c)+1);
		}
		else
			hm.put(c,1);
		}
	
	hm.remove(' ');
	for(Map.Entry<Character,Integer> m:hm.entrySet())
	{
		if(m.getKey()=='a'||m.getKey()=='e'||m.getKey()=='i'||m.getKey()=='o'||m.getKey()=='u')
		{
		System.out.println(m.getKey()+" is appearing "+m.getValue()+ "times"); 
		}
		
	}
	
	}
}

