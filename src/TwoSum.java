import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int arr[] = {2,7,11,15};
		
		int res [] = new TwoSum().twoSum(arr, 9);
		System.out.print(res[0]);
		System.out.print(res[1]);
		
	}
	public int[] twoSum(int[] nums,int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		
		for(int j=0;j<nums.length;j++) {
			if(map.containsKey(target - nums[j]) && map.get(target - nums[j]) != j) {
				return new int[] {j,map.get(target - nums[j])};
			}
		}
		throw new IllegalAccessError();
	}

}
