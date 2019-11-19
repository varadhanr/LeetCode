import java.util.LinkedHashSet;

public class SubstringWithKDIstinctCharacters {
	
	public LinkedHashSet<String> getSubstrings(String s, int k){
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i =0;i<s.length()-k+1;i++) {
			StringBuilder sb = new StringBuilder();
			String st = "";
			for(int j=i;j<i+k;j++) {
				if(st.indexOf(s.charAt(j))!=-1) {
					break;
				}
				else {
					st = st+s.charAt(j);
				}	
			}
			if(st.length()==k){
				set.add(st);
			}
		}
		return set;
			
	}

}
