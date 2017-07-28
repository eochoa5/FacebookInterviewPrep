import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args){
		
		int[] nums  = {5, 4, 2, 3, 1};
		
		//sorting takes O(n log(n))
		//not recommended to sort and use binary search, if not sorted, use 
		//different approach 
		Arrays.sort(nums);
		
		// O(log(n)) to binary search
		System.out.println(binarySearch(nums, 2));
		
		
		//built in java method
		System.out.println(Arrays.binarySearch(nums, 3));
			
		
		//Time complexity = O(n log(n) + log(n))= O(n log(n))
		
	}
	public static int binarySearch(int[] input, int key) {
		
		int start = 0;
		int end = input.length -1;
		
		int middle;
		
		while(start <= end){
			
			middle = (end + start) / 2;
			
			if(key == input[middle]){
				return middle;
			}
			else if(key < input[middle]){
				end = middle - 1;
			}
			else{
				start = middle + 1;
			}
			
		}
		
		return -1;
    
    }
}
