import java.util.Arrays;

public class getNumOfPerfectSquares {

	public static void main(String[] args) {
		
		String[] strs = {"1 4", "1 9"};
		
		System.out.println(Arrays.toString(getNumOfPerfectSquares(strs)));
		

	}
	
	 public static int[] getNumOfPerfectSquares(String[] arr) {
		 
		 int [] intArray = new int[arr.length];
		 
		 int count = 0;
	        
	        for(int i=0; i<arr.length; i++){
	            
	            String[] integers = arr[i].split(" ");
	            
	            if(integers.length > 1){
	            	
	            	int from = Integer.parseInt(integers[0]);
	            	int to = Integer.parseInt(integers[integers.length-1]);
	            	
	            	for(int j=from; j<=to; j++){
		            	
		            	if(Math.sqrt(j) % 1 == 0){
		            		  count++;
		            		}
		            	
		            }
	            	intArray[i] = count;
	            	count = 0;
	            	
	            }
	            
	            
	             
	        }
	        
	       

	        return intArray;  
	        
	 }
	
	

}
