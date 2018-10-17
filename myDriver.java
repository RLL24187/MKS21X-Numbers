public class myDriver{
  public static void main(String[] args){
    RealNumber a = new RealNumber(2.5);
    RealNumber b = new RealNumber(7.5);
    RealNumber c = new RealNumber(2.5);
    RealNumber zero = new RealNumber(0.0);
    System.out.println("Testing RealNumber.java:");
      System.out.println("Testing toString");
        System.out.println("  Should print 2.5");
        System.out.println(a);
        System.out.println("  Should print 7.5");
        System.out.println(b);
      System.out.println("Testing operations:");
        System.out.println("  2.5 + 7.5 = 10.0");
        System.out.println(a.add(b)); //Should print 10.0
        System.out.println("  2.5 * 7.5 = 18.75");
        System.out.println(a.multiply(b));//Should print 18.75
        System.out.println("  7.5 / 2.5 = 3.0");
        System.out.println(b.divide(a));//Should print 3.0
        System.out.println("  Should print 0.0");
        System.out.println(zero.divide(b));//Should print 0.0
        System.out.println("  Should print Error Message followed by 0.0");
        System.out.println(a.divide(zero));//Should print Error
        System.out.println("  Should print 5.0");
        System.out.println(b.subtract(a));//Should print 5.0
      System.out.println("\n\nTesting equal functions:");
        System.out.println("  Should print false");
        System.out.println(a.equals(b));//Should print false
        System.out.println("  Should print false");
        System.out.println(a.equals(a));//Should print true
        System.out.println("  Should print true");
        System.out.println(a.equals(c));//Should print true
      System.out.println("\n\nTesting greaterThan function:");
        System.out.println("  Should print false");
        System.out.println(a.greaterThan(b));//Should print false
        System.out.println("  Should print false");
        System.out.println(a.greaterThan(a));//Should print false
        System.out.println("  Should print true");
        System.out.println(b.greaterThan(c));//Should print true
    RationalNumber A = new RationalNumber(1, 2);
    RationalNumber B = new RationalNumber(0, 3);
    RationalNumber C = new RationalNumber(2, 4);
    RationalNumber D = new RationalNumber(-9, 6);
    RationalNumber error = new RationalNumber(8, 0);
    RationalNumber Zero = new RationalNumber(0, -16);
    System.out.println("\n\nTesting RationalNumber.java:");
      System.out.println("Testing toString");
        System.out.println("  Should print 1/2");
        System.out.println(A);
        System.out.println("  Should print 0/3");
        System.out.println(B);
        System.out.println("  Should print 1/2");
        System.out.println(C);
        System.out.println("  Should print -3/2");
        System.out.println(D);
        System.out.println("  Should print 0/1");
        System.out.println(error);
      System.out.println("Testing getValue");
        System.out.println("  Should print 0.5");
        System.out.println(A.getValue());
        System.out.println("  Should print 0.0");
        System.out.println(B.getValue());
        System.out.println("  Should print -0.0");
        System.out.println(Zero.getValue());
      System.out.println("Testing operations");
        System.out.println("  Testing Reciprocal");
          System.out.println("   Should print 2/1");
          System.out.println(A.reciprocal()); //Should get 2/1
          System.out.println("   Should print 0/1");
          System.out.println(error.reciprocal()); //Should get 0/1
          System.out.println("   Should print 2/-3");
          System.out.println(D.reciprocal()); //Should get 2/-3
      //System.out.println("Testing gcd (when it was public)");
        /*
        System.out.println(RationalNumber.gcd(42, 12)); //Should get 6
        System.out.println(RationalNumber.gcd(20, 15)); //Should get 5
        System.out.println(RationalNumber.gcd(360, 96)); //Should get 24
        System.out.println(RationalNumber.gcd(12, 42)); //Should get 6
        System.out.println(RationalNumber.gcd(1, 1)); //Should get 1
        */
      //System.out.println("Testing reduce (when it was public)");
        /*
        System.out.println(RationalNumber.gcd(D.getNumerator(), D.getDenominator()));
        D.reduce();
        System.out.println(D); //Should get -3/2
        */
      System.out.println("  Testing Basic Operations");
        System.out.println("   Should print 1/1");
        System.out.println(A.add(C)); //Should get 1/1
        System.out.println("   Should print 0");
        System.out.println(A.subtract(C)); //Should get 0/16
        System.out.println("   Should print 0/-48");
        System.out.println(Zero.multiply(B)); //Should get 0/-48
        System.out.println("   Should print -3/1");
        System.out.println(D.divide(A)); //Should get -3/1
  }
}
