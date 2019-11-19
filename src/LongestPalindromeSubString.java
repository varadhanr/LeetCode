/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class LongestPalindromeSubString {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSubString().longestPalindrome("cbbd"));
    }
    public String longestPalindrome(String s) {
        if(s.trim().isEmpty()){
            return s;
        }
        String finalStr = new String();
        for(int i=0;i<s.length();i++){
            int backward = i;
            int forward = i;
            boolean con = true;
            while(backward >= 0 && forward < s.length() && con){
                if(s.charAt(backward) == s.charAt(forward)){
                    backward --;
                    forward ++;
                }else{
                    con = false;
                }
            }
            String a = s.substring(backward < 0 ? 0 : backward+1, forward);
            finalStr = finalStr.length() < a.length() ? a : finalStr;
            
            int backward1 = i;
            int forward1 = i+1;
            boolean con1 = true;
            while(backward1 >= 0 && forward1 < s.length() && con1){
                if(s.charAt(backward1) == s.charAt(forward1)){
                    backward1 --;
                    forward1 ++;
                }else{
                    con1 = false;
                }
            }
            String b = s.substring(backward1 < 0 ? 0 : backward1+1, forward1);
            finalStr = finalStr.length() < b.length() ? b : finalStr;
        }
       // s.substring(backw, 0)
        return finalStr;
    }
}
