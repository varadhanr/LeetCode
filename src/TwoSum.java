
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * https://leetcode.com/problems/two-sum/
 * @author varadhan
 */
class TwoSum {

    public static void main(String[] args) {
        int[] ans = new TwoSum().twoSum(new int[]{2,7,11,15}, 9);
        for(int i : ans){
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }
        }
        throw new IllegalArgumentException();
    }
}
