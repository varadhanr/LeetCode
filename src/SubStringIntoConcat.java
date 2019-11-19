import java.util.ArrayList;
import java.util.List;

public class SubStringIntoConcat {

	public static void main(String[] args) {
		
		String[] words = {"foo","bar"};
		String s = "barfoothefoobarman";
		
		List<Integer> out = new SubStringIntoConcat().findSubstring(s, words);
		System.out.println(out.toString());
		
	}

	public List<Integer> findSubstring(String s, String[] words) {

		
		
		return new ArrayList<Integer>();
		

	}

	
	public String combineAllStrings(String[] words, String finalStr) {
		for (int i = 0; i < words.length; i++) {
			finalStr = finalStr + words[i];
		}
		return finalStr;
	}
}
