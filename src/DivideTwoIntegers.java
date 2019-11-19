
public class DivideTwoIntegers {
	
	public static void main(String[] args) {
		
		System.out.println(new DivideTwoIntegers().divide(7, -3));
		
	}
	
	public int divide(int dividend, int divisor) {
        int sign = (dividend ^ divisor) & 0x80000000;
        int negDivisor = (divisor & 0x80000000) !=0? divisor : -divisor;
        int negRemainder = (dividend & 0x80000000) !=0? dividend : -dividend;
        
        int result = 0;
        while(negRemainder <= negDivisor) {
            int dividerOnStep = negDivisor;
            int step = 1;
            while(negRemainder <= (dividerOnStep<<1) && (dividerOnStep<<1) < 0) {
                dividerOnStep<<=1;
                step <<=1;
                if (negRemainder == dividerOnStep) {
                    break;
                }
            }
            negRemainder = negRemainder - dividerOnStep;
            result -=step;
            if (result > 0) {//overflow
                return Integer.MAX_VALUE;
            }
            
        }
        if (sign == 0) {
            result = -result; 
            if (result < 0) { // overflow, since it should be positive
                return Integer.MAX_VALUE;
            }
        } 
        return result;
    }
}
