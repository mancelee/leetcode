/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 *
 * https://leetcode-cn.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (28.99%)
 * Total Accepted:    20.8K
 * Total Submissions: 71.5K
 * Testcase Example:  '"Hello World"'
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 
 * 如果不存在最后一个单词，请返回 0 。
 * 
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 * 示例:
 * 
 * 输入: "Hello World"
 * 输出: 5
 * 
 * 
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int end = 0;
        boolean flag = false;
        if(s == null || s.length() == 0) return 0;
        for (int i = s.length() -1; i >= 0; i--) {
            if(!flag && s.charAt(i) != ' ') {
                end = i;
                flag = true;
            }
            if(end != 0 && s.charAt(i)== ' '){
                return end - i;
            }
        }
        if(flag){
            return end +1;
        }
        return 0;
    }
}

