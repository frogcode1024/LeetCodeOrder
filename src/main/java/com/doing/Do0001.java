package com.doing;

import java.util.HashMap;
import java.util.Map;

class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if(map.containsKey(val))
                return new int[]{i,map.get(val)};
            else
                map.put(nums[i], i);
        }
        return new int[]{};
    }
}
public class Do0001 {
    public static void main(String[] args) {
        System.out.println("111");
    }
}
