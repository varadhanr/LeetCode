import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(new GroupAnagrams().groupAnagrams(strs));
		
		HashMap<String, List<String>> n = new HashMap<String, List<String>>();
		List<List<String>> result = new ArrayList<List<String>>();
		
		result.addAll(n.values());
		
		

	}

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();

		for (int i = 0; i < strs.length; i++) {
			List<String> list = new ArrayList<String>();
			if(strs[i] == null) continue;
			list.add(strs[i]);
			String str1 = strs[i];
			char[] c = str1.toCharArray();
			Arrays.sort(c);
			str1 = String.valueOf(c);
			for (int j = i + 1; j < strs.length; j++) {
				String str2 = strs[j];
				if(str2 == null) continue;
				char[] c1 = str2.toCharArray();
				Arrays.sort(c1);
				str2 = String.valueOf(c1);
				if (str1.equals(str2)) {
					list.add(strs[j]);
					
					strs[j] = null;
				}

			}
			
				result.add(list);
			
		}

		return result;

	}

}
