/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode-cn.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (47.10%)
 * Total Accepted:    19.3K
 * Total Submissions: 40.9K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 
 * 示例 2:
 * 
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        int tmp = 0;
        StringBuilder sb = new StringBuilder();
        int length = Math.max(a.length(), b.length());
        if (a.length() < length) {
            a = appendStr(a, length - a.length());
        } else if (b.length() < length) {
            b = appendStr(b, length - b.length());
        }
        for (int i = length - 1; i >= 0; i--) {
            int current = b.charAt(i) + a.charAt(i) + tmp - '0' - '0';
            sb.append(current % 2);
            tmp = current / 2;
        }
        if (tmp == 1) {
            sb.append(tmp);
        }
        return sb.reverse().toString();
    }

    private String appendStr(String s,int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append('0');
        }
        return sb.append(s).toString();
    }
}
