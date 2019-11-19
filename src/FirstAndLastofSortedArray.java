import java.util.HashMap;
import java.util.Map;

class Solution {
	
	int max = Integer.MAX_VALUE;
	
	Map<Integer,Integer> lett = new HashMap<Integer,Integer>();
	
	map
	
    public int search(int[] nums, int target) {
        int l=nums.length;
        if(l==0) return -1;
        int i=0,j=l-1;
        while(j-i>1) {
            //System.out.printf("(%d, %d)\n",left,right);
            if(target==nums[j]) return j;
            if(target==nums[i]) return i;
            int m=(i+j)/2;
            if(nums[i]<nums[j]){
                if(nums[m]==target) return m;
        		else if(nums[m]>target) j=m;
        		else i=m;
            }else{
                if(nums[m]>nums[i]){
                    if(target<nums[i] || target>nums[m]) i=m;
                    else j=m;
                }else{
                    if(target>nums[i] || target<nums[m]) j=m;
                    else i=m;
                }
            }
        }
        if(target==nums[j]) return j;
        if(target==nums[i]) return i;
        return -1;
    }
}