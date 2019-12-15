package datastruct.bitOperation;

/**
 * 190. 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。

  
 示例 1：
 输入: 00000010100101000001111010011100
 输出: 00111001011110000010100101000000
 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。

 示例 2：
 输入：11111111111111111111111111111101
 输出：10111111111111111111111111111111
 解释：输入的二进制串 11111111111111111111111111111101 表示无符号整数 4294967293，
       因此返回 3221225471 其二进制表示形式为 10101111110010110010011101101001。
  

 提示：
 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数 -1073741825。
  

 */
public class ReverseBits {

    /**
     * int --> '010101' string --> reverse --> nint
     * int --> 位运算 -->
     * 位移 + 拼接
     “>>”运算符执行有符号右移位运算。与左移运算操作相反，它把 32 位数字中的所有有效位整体右移，再使用符号位的值填充空位。移动过程中超出的值将被丢弃。

     “<<”运算符执行左移位运算。在移位运算过程中，符号位始终保持不变。如果右侧空出位置，则自动填充为 0；超出 32 位的值，则自动丢弃。


     “>>>”运算符执行五符号右移位运算。它把无符号的 32 位整数所有数位整体右移。对于无符号数或正数右移运算，无符号右移与有符号右移运算的结果是相同的。
     对于负数，左侧空位不再用符号位的值来填充，而是用 0 来填充。

     每次获取原数的最低位，拼接到结果数字结尾里
     获得下一位时右移原数一位
     拼接下一位时提前左移结果数一位

     */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0;i < 32;i++) {
            result = (result << 1) + (n & 1);
            n >>= 1;
        }
        return result >>>0 ;
//        int result = 0;
//        //  result从右往移动空出末位 + n从左往右移动获取末位 + n次 = 倒序
//        for (int i = 0;i < 32;i++) {
//            // 左移空出一位
//            result <<= 1;
//            // n&1获取n的末位，result的末位换成n的末位
//            result |= n & 1 ;
//            // 右移1位
//            n >>= 1;
//        }
//        return result >>> 0;
    }
}
