
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 12344321;
        System.out.println(new PalindromeNumber().isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        String inputX = String.valueOf(x);
        if (inputX.length() > 1 && Character.compare('-', inputX.charAt(0)) == 0) {
                return false;
            }
        int iTHPos;
        int jThPos;
        if(inputX.length() % 2 == 0){
            iTHPos = inputX.length()/2;
            jThPos = iTHPos;
        }else{
            iTHPos = inputX.length() /2;
            jThPos = iTHPos + 1;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(inputX.substring(jThPos, inputX.length()));
        builder = builder.reverse();
        if(inputX.substring(0, iTHPos).equals(builder.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
