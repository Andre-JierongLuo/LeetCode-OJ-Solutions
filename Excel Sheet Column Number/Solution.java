public class Solution {
    public int titleToNumber(String s) {
        int strLength = s.length();
        int total = 0;

        for(int i = 0; i < strLength; i++){
                char character = s.charAt(i);
                /*
                * convert capital letter to integer.
                * example: A to 1
                * A in ASCII is 65
                */
                int num = (int) character - 64;
                total += Math.pow(26, strLength - 1 - i) * num;
        }

        return total;
    }
}