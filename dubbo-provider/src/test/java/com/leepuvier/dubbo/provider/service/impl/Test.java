package com.leepuvier.dubbo.provider.service.impl;

import static java.util.Arrays.binarySearch;

/**
 * @Author : LeePuvier
 * @CreateTime : 2019/11/6  9:18 PM
 * @ContentUse :
 */
public class Test {
    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 13;
        check(nums, target);
    }
    public static  int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0; i < nums.length; i ++){
            int temp =  target - nums[i];
            int targetIndex = binarySearch(nums, temp);
            if (targetIndex > 0 ) {
                index[0] = i;
                index[1] = targetIndex;
                break;
            }
        }
        return index;
    }

    public static  int[] check(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0; i < nums.length; i ++){
            int temp =  target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if (temp == nums[j]) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }
}
