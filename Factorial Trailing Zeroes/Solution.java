/*
	The idea is that find out the total number of factor 5.
	since 2 * 5 = 10;
*/

public class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n/5);
    }
}