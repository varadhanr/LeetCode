import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesis {
	
	public static void main(String[] args) {
		
		List<String> pol = new GenerateParanthesis().generateParenthesis(3);
		for(int i=0;i<pol.size();i++) {
			System.out.println(pol.get(i));
		}
		
	}
	
public List<String> generateParenthesis(int n) {
	
	List<String> all = new ArrayList<String>();
//	new String(2 * n);
	generate("", 0, all,2 * n);
	return all;
        
    }

public void generate(String comb,int pos,List<String> results,int n) {
	
	if(pos == n) {
		if(isValid(comb)) {
			results.add(comb);
			};
	}else {
		
		generate(comb+'(', pos+1, results,n);
//		comb[pos] = ')';
		generate(comb+')', pos+1, results,n);
	}
	
}
public boolean isValid(String s) {

	Stack<Character> stk = new Stack<Character>();
	for (int i = 0; i < s.length(); i++) {
		Character ch = s.charAt(i);
		if (ch == '{' || ch == '(' || ch == '[') {
			stk.push(ch);
		} else if (ch == '}' || ch == ')' || ch == ']') {
			if(stk.isEmpty()) {
				return false;
			}
			Character match = stk.pop();
			if (!((ch == '}' && match == '{') || (ch == ']' && match == '[') || (ch == ')' && match == '('))) {
				return false;
			}
		}
	}
	
	if(stk.isEmpty()) {
		return true;
	} else
	return false;

}

}
