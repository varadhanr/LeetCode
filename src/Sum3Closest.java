
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class Sum3Closest {
    public static void main(String[] args) {
        System.out.println(new Sum3Closest().threeSumClosest(new int[]{0,2,1,-3}, 0));
    }
    public int threeSumClosest(int[] nums, int target) {
//        public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i< nums.length -2 ; i++){
            if(i > 1 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length -1;
            while(left < right){
                int temp = nums[i] + nums [left] + nums[right];
                int diff = Math.abs(temp - target);
                if(diff < min_diff){
                    result = temp;
                    min_diff = diff;
                }else if(temp > target){
                    right --;
                }else if(temp < target){
                    left ++;
                }else{
                    return target;
                }
            }
            
        }
        return result;
    }
}
