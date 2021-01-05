

/**********************************************************************************
 3. 无重复字符的最长子串
 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。



 示例 1:

 输入: s = "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 示例 2:

 输入: s = "bbbbb"
 输出: 1
 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 **********************************************************************************/
package com.lc.code;

import java.util.HashSet;
import java.util.Set;

class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        // 滑动窗口
        // 滑动窗口指的是，左端一格一格移动，右端滑动到最大
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int res = 0;
        while(i<len && j<len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                res = Math.max(res, j-i+1);
                j++;

            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}
public class LC0003 {
    public static void main(String[] args) {
        String test = "abcabcbb";
        int res = new Solution0003().lengthOfLongestSubstring(test);
        System.out.println(res);
    }
}
