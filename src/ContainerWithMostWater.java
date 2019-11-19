/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class ContainerWithMostWater {
    
    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int i = 0; int j = height.length - 1;
        while(i < j){
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }
    
}
