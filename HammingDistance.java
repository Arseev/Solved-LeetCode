/**
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 = x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ?   ?

The above arrows point to positions where the corresponding bits are different.
**/

public class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        char[] strBinaryX = binaryX.toLowerCase().toCharArray();
        char[] strBinaryY = binaryY.toLowerCase().toCharArray();
        
        int maxLength = Math.max(strBinaryX.length, strBinaryY.length);
        int difInt = Math.abs(strBinaryX.length - strBinaryY.length);
        int count = 0;
        
        
        while (difInt > 0) {
            if (strBinaryX.length < strBinaryY.length) {
                binaryX = ("0" + binaryX);
                difInt--;
            }
            else {
                binaryY = ("0" + binaryY);
                difInt--;
            }
        }
        
        
        for (int i = 0; i < maxLength; i++) {
            char bX = binaryX.charAt(i);
            char bY = binaryY.charAt(i);
            if (bX != bY) {
                count++;
            }
        }
        //System.out.println(binaryX);
        //System.out.println(binaryY);
        return count;
    }
}