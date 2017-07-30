import java.util.HashSet;
import java.util.Set;

public class FindPairWithSum {
	
	public static void main(String[] args){
		
		//sorted array
		int[] a1 = {1, 2 , 3, 5};
		
		//unsorted array
		int[] a2 = {3, 5 , 1, 2, 6};
		
		System.out.println(hasPairWithSumSorted(a1, 8));
		System.out.println(hasPairWithSum(a2, 11));
		
	}
	
	
	//use Hashset, good for lookups O(1)
	//O(n)
		public static boolean hasPairWithSum(int[] arr, int sum){
			
			Set<Integer> need  = new HashSet<>();
			
			for(int i=0; i<arr.length; i++){
				
				if(need.contains(arr[i])){
					return true;
				}else{
					need.add(sum - arr[i]);
				}
				
			}
			
			return false;
				
		}
	
	// O(n) but array has to be sorted, O(n log(n)) to sort
	public static boolean hasPairWithSumSorted(int[] arr, int sum){
		
			int low = 0;
			int high = arr.length-1;
			
			while(low < high){
				
				int s = arr[high] + arr[low];
				
				if(sum == s){ 
					return true;
				}
				else if(sum < s ){
					high -=1;
				}
				else{
					low +=1;
				}
				
			}
			
			return false;
	
	}

}
