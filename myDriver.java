public class myDriver{
  public static void main(String[] args){
    RealNumber a = new RealNumber(2.5);
    RealNumber b = new RealNumber(7.5);
    RealNumber c = new RealNumber(2.5);
    RealNumber zero = new RealNumber(0.0);
    //Testing RealNumber.java
      //Testing toString
        /*
        System.out.println(a);
        System.out.println(b);
        */
      //Testing operations
        /*
        System.out.println(a.add(b)); //Should print 10.0
        System.out.println(a.multiply(b));//Should print 18.75
        System.out.println(b.divide(a));//Should print 3.0
        System.out.println(zero.divide(b));//Should print 0.0
        System.out.println(a.divide(zero));//Should print Error
        System.out.println(b.subtract(a));//Should print 5.0
        */
      //Testing equal functions
        /*
        System.out.println(a.equals(b));//Should print false
        System.out.println(a.equals(a));//Should print true
        System.out.println(a.equals(c));//Should print true
        */
      //Testing greaterThan function;
        /*
        System.out.println(a.greaterThan(b));//Should print false
        System.out.println(a.greaterThan(a));//Should print false
        System.out.println(b.greaterThan(c));//Should print true
        */
    RationalNumber A = new RationalNumber(1, 2);
    RationalNumber B = new RationalNumber(0, 3);
    RationalNumber C = new RationalNumber(2, 4);
    RationalNumber D = new RationalNumber(-9, 6);
    RationalNumber error = new RationalNumber(8, 0);
    RationalNumber Zero = new RationalNumber(0, -16);
    //Testing RationalNumber.java
      //Testing toString
        /*
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        */
      //Testing operations
        //Testing Reciprocal
          /*
          System.out.println(A.reciprocal()); //Should get 2/1
          System.out.println(error.reciprocal()); //Should get 0/8
          System.out.println(D.reciprocal()); //Should get 6/-9
          */
      //Testing gcd (when it was public)
        /*
        System.out.println(RationalNumber.gcd(42, 12)); //Should get 6
        System.out.println(RationalNumber.gcd(20, 15)); //Should get 5
        System.out.println(RationalNumber.gcd(360, 96)); //Should get 24
        System.out.println(RationalNumber.gcd(12, 42)); //Should get 6
        System.out.println(RationalNumber.gcd(1, 1)); //Should get 1
        */
      //Testing reduce (when it was public)
        /*
        System.out.println(RationalNumber.gcd(D.getNumerator(), D.getDenominator()));
        D.reduce();
        System.out.println(D); //Should get -3/2
        */
      //Testing Operations
  }
}
