# https://leetcode-cn.com/problems/reverse-string-ii/
# 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。

# 示例:

# 输入: s = "abcdefg", k = 2
# 输出: "bacdfeg"
# 要求:

# 该字符串只包含小写的英文字母。
# 给定字符串的长度和 k 在[1, 10000]范围内。

# 来源：力扣（LeetCode）
# 链接：https://leetcode-cn.com/problems/reverse-string-ii
# 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class Solution(object):
    def reverseStr(self, s, k):
        a = list(s)
        for i in range(0, len(a), 2*k):
            a[i:i+k] = reversed(a[i:i+k])
        return "".join(a)
        