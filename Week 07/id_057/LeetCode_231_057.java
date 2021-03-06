package app.homeworkWeekSeventh;

/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 *
 * https://leetcode.com/problems/power-of-two/description/
 *
 * algorithms
 * Easy (42.44%)
 * Likes:    551
 * Dislikes: 147
 * Total Accepted:    258.8K
 * Total Submissions: 607.9K
 * Testcase Example:  '1'
 *
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * Example 1:
 * 
 * 
 * Input: 1
 * Output: true 
 * Explanation: 2^0 = 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 * 
 * Example 3:
 * 
 * 
 * Input: 218
 * Output: false
 * 
 */

// @lc code=start
class Solution {
    /**
     * 二进制表示法中，2的幂就只有一位是1，那么 n & (n-1) == 0；
     * Time O(1)
     * Space O(1)
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1))== 0;
    }
}
// @lc code=end

