/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        return find(strs);
    }

    public String find(String[] strs) {
        int i = 0;
        String ans = strs[0];
        while(i < strs.length - 1){
             ans = compute(ans, strs[i+1]);
            if(ans.isEmpty()){
                return "";
            }
            i++;
        }
        return ans;

    }

    public String compute(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                finalStr.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return finalStr.toString();
    }
}
