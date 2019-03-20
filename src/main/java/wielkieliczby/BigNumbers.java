package wielkieliczby;

import java.math.BigDecimal;

public class BigNumbers {
    public static void main(String[] args) {
        double a = 88.7;
        double b = 8.3;
        System.out.println("a-b=" + (a - b));


        BigDecimal aBig = BigDecimal.valueOf(a);
        BigDecimal bBig = BigDecimal.valueOf(b);

        System.out.println("aBig - bBig =" + aBig.subtract(bBig));
      //  System.out.println("aBig/bBig="+aBig.divide(bBig));
        System.out.println("aBig * bBig ="+aBig.multiply(bBig));
        System.out.println("aBig + bBig ="+aBig.add(bBig));

    }
}
