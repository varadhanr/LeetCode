
public class strStr {
	
	public static void main(String[] args) {
		
		System.out.println(new strStr().strStr1("aaaaa", "bba"));
		
	}
	
public int strStr1(String haystack, String needle) {
    
	if(needle.isEmpty()) return 0;
	
	if(haystack.contains(needle)) {
		return haystack.indexOf(needle);
	}else return -1;
	
	//return 0;
    }

}
