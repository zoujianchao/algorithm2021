package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/21
 * @description : 最小覆盖子串
 */
public class LeetCode76 {
    public static String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        //hash用来统计每个字符出现的次数
        //在t中出现-1 在s中出现+1
        //在hash中所有的字符出现的次数都非负,说明匹配上了
        int[] hash = new int[128];
        for (char ch : t.toCharArray()) {
            hash[ch]--;
        }
        String ans = "";
        //left: ans的左端位置
        //right: ans的右端位置
        //cnt: 已经匹配上的字符数
        for (int left = 0, right = 0, cnt = 0; right < sLen; right++) {
            //如果当前字符可以匹配到t中尚未匹配的字符,就将cnt+1
            if (++hash[s.charAt(right)] <= 0) {
                cnt ++;
            }
            //如果t中所有字符匹配上,那么试图缩进左边界
            while (cnt == tLen && hash[s.charAt(left)] > 0) {
                hash[s.charAt(left++)]--;
            }
            //如果t中所有字符均匹配上,尝试更新ans
            if (cnt == tLen) {
                //只在ans为空字符串或者ans长度大于当前长度时更新
                if ("".equals(ans) || ans.length() > right - left + 1) {
                    ans = s.substring(left, right + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        minWindow("ADOBECODEBANC", "ABC");
    }
}
