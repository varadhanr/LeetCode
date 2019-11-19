import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumPair {
	
	
public static void main(String[] args) {
	
	int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	
	
		
		
		
	}

public int[] twoSum(int[] nums, int target) {
    
	
	Arrays.sort(nums);
	
	int [] arr = new int[2];
	for(int i=0,j=nums.length;i<j ;) {
		if(nums[i] + nums[j] == target) {
			arr[0] = i;
			arr[1] = j;
			
		}else if(nums[i] + nums[j] > target) {
			j--;
			
		}else if(nums[i] + nums[j] < target) {
			i++;
		}
	}
    return arr;
    
}

}
