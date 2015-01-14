public class Solution {
    public String convertToTitle(int n) {
        String sheet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int x = n;
        String ret = "";
        // This is a reverse way to find the title.
        while((x/26) != 0 || (x%26) != 0){
            int a = x / 26;
            int b = x % 26;
            if(b == 0){
                ret += sheet.charAt(25);
                x = a-1;
            } else {
                ret += sheet.charAt(b-1);
                x = a;
            }
        }
        String soln = new StringBuffer(ret).reverse().toString();
        return soln;
    }
}