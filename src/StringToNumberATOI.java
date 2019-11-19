/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class StringToNumberATOI {

    public static void main(String[] args) {
        System.out.println(new StringToNumberATOI().myAtoi("-1010023630o4"));
    }

    public int myAtoi(String str) {
        if (str.trim().isEmpty()) {
            return 0;
        }
        str = str.trim();
        int ans = 0;
        boolean doesNegative = false;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 ) {
                if (Character.compare(str.charAt(i), '-') == 0) {
                    doesNegative = true;
                    continue;

                } else if (Character.compare(str.charAt(i), '+') == 0) {
                    doesNegative = false;
                    continue;

                }
                            }
            double intMax = Integer.MAX_VALUE;
            double intMin = Integer.MIN_VALUE ;
            if (ans > (intMax-Character.getNumericValue(str.charAt(i)))/10) {
                if(!Character.isDigit(str.charAt(i))){
                    break;
                }
                if (doesNegative) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
//                    break;
            } else if (ans < intMin/10) {
                return Integer.MIN_VALUE;
//                    break;
            }
            if (Character.isDigit(str.charAt(i))) {
                ans = ans * 10 + Character.getNumericValue(str.charAt(i));

            } else {
                break;
            }
        }
        if (doesNegative) {
            ans = ans * (-1);
        }
        return ans;
    }
}
