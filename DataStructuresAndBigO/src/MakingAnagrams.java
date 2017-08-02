import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakingAnagrams {

	public static void main(String[] args) {
		String one = "a"; 
		String two = "aaa";
		
		System.out.print(numNeededToMakeAnagrams(one, two));

	}
	
	public static int numNeededToMakeAnagrams(String first, String second){
		
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		int needed = 0;
		
		for(int i = 0; i<first.length(); i++){
			
			char c = first.charAt(i);
			
			map.put(c, map.get(c) == null ? 1 : map.get(c)+1 );
			
		}
		
		for(int i = 0; i<second.length(); i++){
			
			char c = second.charAt(i);
			
			map2.put(c, map2.get(c) == null ? 1 : map2.get(c)+1 );
			
		}
		
		Set<Character> unique  = new HashSet<>(map.keySet());
		unique.addAll(map2.keySet());
		
		for(Character c: unique){
			
			int a = map.get(c) == null ? 0 : map.get(c);
			int b = map2.get(c) == null ? 0 : map2.get(c);
			
			needed += Math.abs(a-b);
		}
		
		
		return needed;
		
	}

}
