public class Solution {
    public static String[] helper(char x){
		if(x == '2')
			return new String[]{"a", "b", "c"};
		if(x == '3')
			return new String[]{"d", "e", "f"};
		if(x == '4')
			return new String[]{"g", "h", "i"};
		if(x == '5')
			return new String[]{"j", "k", "l"};
		if(x == '6')
			return new String[]{"m", "n", "o"};
		if(x == '7')
			return new String[]{"p", "q", "r", "s"};
		if(x == '8')
			return new String[]{"t", "u", "v"};
		if(x == '9')
			return new String[]{"w", "x", "y", "z"};
		else 
			return new String[]{};
	}
	
    public List<String> letterCombinations(String digits) {
        LinkedList<String> queue = new LinkedList<String>();
		queue.add("");

		for(int i = 0; i < digits.length(); i++){
			String[] tmp = helper(digits.charAt(i));
			if(tmp.length == 0)
				continue;

			int size = queue.size();
			for(int j = 0; j < size; j++){
				String cur = queue.removeFirst();
				for(String str : tmp){
					String str2 = cur+str;
					queue.add(str2);
				}
			}
		}
		
		return queue;
    }
}