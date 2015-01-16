// This is a fibonacci actually.

public class Solution {
    public int climbStairs(int n) {
        int soln = 0;
        if(n == 0)
            return 0;
   		if(n == 1)
   			return 1;
   		if(n == 2)
   			return 2;

   		int first = 1;
   		int second = 2;

   		for(int i = 3; i <= n; i++){
   			soln = first + second;
   			first = second;
   			second = soln;
   		}
   		return soln;
    }
}