/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 *
 * https://leetcode-cn.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (37.86%)
 * Total Accepted:    42.3K
 * Total Submissions: 111.6K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * 
 * 
 */
class Solution {
    public int[] plusOne(int[] digits) {
        return move(digits, digits.length -1);
    }

    private int[] move(int[] nums,int index){
        nums[index] += 1;
        if(nums[index] > 9){
            nums[index] = 0;
            if(index==0){
                int[] tmp = new int [nums.length + 1];
                for (int i = nums.length -1; i >= 0; i--) {
                    tmp[i+1] = nums[i];
                }
                nums = tmp;
                index++;
            }
            nums = move(nums, --index);
        }
        return nums;
    }
}

