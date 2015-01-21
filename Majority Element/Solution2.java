// solution that using hashtable.
// It takes O(n) time, and O(n) space.

public class Solution {
    public int majorityElement(int[] num) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int size = num.length;
        for(int i = 0; i < size; i++){
            int n = num[i];
            if(!hm.containsKey(n)){
                hm.put(n, 1);
            } else {
                int count = hm.get(n);
                hm.put(n, count+1);
            }
            if(hm.get(n) > (size/2))
                return n;
        }
        
        // won't reach here.
        return 0;
    }
}