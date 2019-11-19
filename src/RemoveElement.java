
public class RemoveElement {

	public static void main(String[] args) {
		
		int nums[]= {3,2,2,3};
		int l = new RemoveElement().removeElement(nums, 3);
		System.out.println(l);
		
		for(int i=0;i<l;i++) {
			System.out.println(nums[i]);
		}

	}

	public int removeElement(int[] nums, int val) {

		if(nums.length == 0 ) return 0;
		int length = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				remove(nums, i);
				length --;
			}
		}
		return length;
	}
	
	public void remove(int[] nums,int index) {
		for(int i=index;i<nums.length-1;i++) {
			nums[i] = nums[i+1];
		}
	}

	
}
