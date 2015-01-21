// solution that using sort. It takes O(nlog(n))

public class Solution {
    public int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }
}