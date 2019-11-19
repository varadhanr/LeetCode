
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));

    }
    //pwwkew
    /*
    prev = 1 curr = 1
    prev = 1 curr = 2
    prev = 1 curr = 
    
    */
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int i=0;int j=0;int count = 0; ;
        while(i < len && j< len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count = Math.max(count, j-i);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
}
}
