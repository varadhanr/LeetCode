
public class LongestPalindrome {
	
	public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        int max = Integer.MIN_VALUE;
        String output = "";
        for(int i=0;i<s.length();i++){
            dp[i][i] = 1;
            output = s.substring(i,i+1);
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i)){
                dp[i][i-1] = 1;
                output = s.substring(i-1,i+1);
            }
        }
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<i-1;j++){
                if(s.charAt(i) == s.charAt(j) && dp[i-1][j+1] == 1){
                    String temp = s.substring(j,i+1);
                    if(temp.length() > max){
                        max = i-j+1;
                        output = temp;
                    }
                    dp[i][j] = 1;
                }
            }
        }
        return output;
        
    }

}
