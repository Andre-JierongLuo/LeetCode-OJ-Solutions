public class Solution {
    public String largestNumber(int[] num) {
        ArrayList<String> list = new ArrayList<String>();

        // convert all of the integers in num to strings and store them in list.
		for(int x : num){
			String str = Integer.toString(x);
			list.add(str);
		}

		// sort list with special sorting method.
		Collections.sort(list, new Comparator<String>(){
			public int compare(String s1, String s2){
				/* 
				*combine two strings together and see which 
				*combination has the larger value in integer.
				*/
				String str1 = s1+s2;
				String str2 = s2+s1;
				// we need the result in descending order.
				return str2.compareTo(str1);
			}
		});

		String soln = "";

		for(String s : list){
			soln += s;
		}
		
		if(soln.charAt(0) == '0'){
			return "0";
		}
		
		return soln;
    }
}