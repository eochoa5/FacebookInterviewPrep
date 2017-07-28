import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
	
	/*
	 
	 Given a string, write a function to check if it is a permutation of
	 a palindrome. 
	 
	 ex: taco cat = palindrome.  'Tact Coa' is a permutation of this palindrome
	 
	 
	 -String of even length(no spaces included) must have even counts of chars
	 - odd length must have exactly one char with odd count
	 
	 Goal: O(n) ... go
	 
	 */

	public static void main(String[] args) {
		String p1 = "Tact Coa";
		String p2 = "Syntactic sugar";
		String p3 = "Go hang a salami, I'm a lasagna hog";
		String p4 = "Mr Owl ate my metal worm";
		
		System.out.println(isPermutationOfPalindrome(p1)); //true
		System.out.println(isPermutationOfPalindrome(p2)); //false
		System.out.println(isPermutationOfPalindrome(p3)); // true
		System.out.println(isPermutationOfPalindrome(p4)); //true
		
		//Time complexity = O(n + n) = O(n) ... done 

	}
	
	public static boolean isPermutationOfPalindrome(String phrase){
		
		Map<Character, Integer> mp = new HashMap<>();
		
		int length = 0;
		
		for(int i =0; i < phrase.length(); i++){
			
			char c = Character.toLowerCase(phrase.charAt(i));
			
			if(Character.toString(c).matches("[A-Za-z0-9]")){
				
				length++;
			
				
				if(mp.get(c) == null){
					mp.put(c, 1);
				}
				else{
					mp.put(c, mp.get(c)+1);
				}
			}
			
		}
		
		boolean even = length % 2 == 0;
		
		int oddCount = 0;
		
		for(Character c: mp.keySet()){
			//even length phrase all char count must be even
			if(even){
				if(mp.get(c) % 2 != 0){return false;}
			} 
			else{
				if(mp.get(c) % 2 != 0){oddCount++;}
			}	
			
		}
		
		if(!even && oddCount != 1){return false;}
		
		return true;
		
	}

}
