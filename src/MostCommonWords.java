import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWords {
	
	public static void main(String[] args) {
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String [] banned = new String[] {"hit"};
		System.out.print(new MostCommonWords().mostCommonWord(paragraph, banned));
		
	}
	public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";

        Set<String> banset = new HashSet<String>();
        for (String word: banned) banset.add(word);
        Map<String, Integer> count = new HashMap<String, Integer>();

        String ans = "";
        int ansfreq = 0;

        StringBuilder word = new StringBuilder();
        for (char c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String finalword = word.toString();
                if (!banset.contains(finalword)) {
                    count.put(finalword, count.getOrDefault(finalword, 0) + 1);
                    if (count.get(finalword) > ansfreq) {
                        ans = finalword;
                        ansfreq = count.get(finalword);
                    }
                }
                word = new StringBuilder();
            }
        }

        return ans;
    }

}
