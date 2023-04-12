package practice;

// Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4x.

// Example 1:
// Input: n = 16
// Output: true
// Example 2:
// Input: n = 5
// Output: false
// Example 3:
// Input: n = 1
// Output: true

// Constraints:
// -231 <= n <= 231 - 1

public class Main {

    public static void main(String[] args) {
        //System.out.println(isPowerOfFour(8));

//        System.out.println(Integer.toBinaryString(0x55555555));
//        System.out.println(Integer.bitCount(Integer.MAX_VALUE));
        String num = Integer.toBinaryString((int)Math.pow(2, 10));
        System.out.println(String.format("%31s", num.replace(' ', '0')));
//        System.out.println("&");
//        System.out.println(Integer.toBinaryString(0x55555555));
//        System.out.println("=");
//        System.out.println(String.format("%31s", Integer.toBinaryString((int)Math.pow(2, 10)&0x55555555)).replace(' ', '0'));
    }

    public static boolean isPowerOfFour(int n) {
        return n > 0 && Integer.bitCount(n) == 1 && (n & 0x55555555) != 0; // 0x55555555 == 1010101010101010101010101010101
    }
}
