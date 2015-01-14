/*
*	find the single one by using XOR.
*	Since A ^ A = 0;
* 	A ^ B ^ A = B;
*/

public class Solution {
    public int singleNumber(int[] A) {
        int soln = A[0];
        for(int i = 1; i < A.length; i++){
            soln ^= A[i];
        }
        return soln;
    }
}