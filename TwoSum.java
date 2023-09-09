// The Two Sum problem asks us to find two numbers in an array that sum up to a given target value.
// We need to return the indices of these two numbers.

import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {   
        int n = nums.length;
        for(int i=0; i< (n-1); i++){
            for(int j=i+1; j< n; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
    //    twoSum solution = new twoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.print("Result 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.print("Result 2: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.print("Result 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}