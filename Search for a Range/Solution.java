public class Solution {
    public int[] searchRange(int[] A, int target) {
        
        int[] soln = new int[]{-1, -1};
        
        int min = 0;
        int max = A.length - 1;
        int mid = (min + max) / 2;
        
        // find the start point
        while(min < max){
            if(A[mid] < target){
                min = mid + 1;
            } else {
                max = mid;
            }
            mid = (min + max) / 2;
        }
        
        // can't find the target in the array, then return [-1,-1]
        if(A[min] != target)
            return soln;
        
        soln[0] = min;
        
        max = A.length - 1;
        mid = (min + max + 1) / 2;
        
        while(min < max){
            if(A[mid] > target){
                max = mid - 1;
            } else {
                min = mid;
            }
            mid = (min + max + 1) / 2;
        }
        
        soln[1] = min;
        
        return soln;
        
    }
}