public class Solution {
    public int lengthOfLastWord(String s) {
        // position of the last character in s.
        int last = -1;
        for(int i = s.length()-1; i>= 0; i--){
            if(s.charAt(i) == ' ' && last == -1)
                continue;
            if(s.charAt(i) == ' ' && last != -1)
                return (last-i);
            if(s.charAt(i) != ' ' && last == -1)
                last = i;
            if(s.charAt(i) != ' ' && last != -1)
                continue;
        }
        if(last == -1)
            return 0;
        else 
            return (last+1);
    }
}