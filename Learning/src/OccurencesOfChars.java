import java.util.HashMap;
import java.util.Map;

public class OccurencesOfChars {

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
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" is appearing "+m.getValue()+ "times"); 
	}

}
}

