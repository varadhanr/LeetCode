import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class LetterCombinations {
	
	public static void main(String[] args) {
		List<String> result = new LetterCombinations().recur("23");
		for(int i = 0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
	
	
	HashMap<String, String> phone = new HashMap<String, String>()
			{{
				put("2","abc");
				put("3","def");
				
				put("4","ghi");
				put("5","jkl");
				put("6","mno");
				put("7","pqrs");
				put("8","tuv");
				put("9","wxyz");
				
				
				
			}};
	
	
	
	public void letterCombination(String comb,String digits,List<String> output) {
		
		if(digits.length() == 0) {
			output.add(comb);
		}
		else {
			String digit = digits.substring(0, 1);
			String letter = phone.get(digit);
			for(int i=0;i<letter.length();i++) {
				String singleLetter = letter.substring(i, i+1);
				letterCombination(comb + singleLetter, digits.substring(1), output);
			}
		}
		
	}
	
	List<String> recur(String digits){
		List<String> output = new ArrayList<String>();
		if(digits.length() != 0) {
			letterCombination("", digits, output);
		}
		return output;
	}
	
	

}
