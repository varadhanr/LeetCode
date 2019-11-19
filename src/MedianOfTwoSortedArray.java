

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * @author varadhan
 */
public class MedianOfTwoSortedArray {
    
    public static void main(String[] args) {
        System.out.println(new MedianOfTwoSortedArray().findMedianSortedArrays(new int[]{}, new int[]{2,3}));
        
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] finalArray = new int[n1+n2];
        if(n1 != 0 && n2 != 0){
        while (i < n1 && j < n2) {
            if (nums1[i] > nums2[j]) {
                finalArray[k++] = nums2[j++];
            } else {
                finalArray[k++] = nums1[i++];
            }
        }
        }
        while (i < n1) {
            finalArray[k++] = nums1[i++];
        }
        while (j < n2) {
            finalArray[k++] = nums2[j++];
        }
        
        int finalLength = finalArray.length;
        if(finalLength == 1){
            return finalArray[0];
        }
        double finalAns ;
        if ((finalLength) % 2 == 0) {
            finalAns = finalArray[((finalLength) / 2)-1] + finalArray[((finalLength) / 2)];
            finalAns = (finalAns) / 2;
            return finalAns;
        } else {
            finalAns = finalArray[((finalLength) / 2)];
            return finalAns;
        }
    }
    
}
