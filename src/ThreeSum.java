import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int nums[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(new ThreeSum().threeSum(nums));

	}

	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);

		if (nums.length < 3)
			return new ArrayList<List<Integer>>();

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length-2; i++) {
			if(i>=1 && nums[i] == nums[i-1] ) continue;
			int x = nums[i];
			int j = i + 1;
			int k = nums.length - 1;
			int target = 0 - (x);
			while (j < k) {
				if (nums[j] + nums[k] == target) {

					List<Integer> subList = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k]));
						result.add(subList);
						while(j<k && nums[j] == nums[j+1])
							j++;
						while(j<k && nums[k] == nums[k-1])
							k--;
					j++;
					k--;

				} else if (nums[j] + nums[k] > target) {
					k--;
				} else
					j++;
			}
		}

		return result;
	}

	public boolean doesContain(List<List<Integer>> finalResult, List<Integer> listToAdd) {

		if (finalResult.contains(listToAdd))
			return true;
		return false;
	}

}
