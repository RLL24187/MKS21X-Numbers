public class RationalNumber extends RealNumber{
  //Instance variables
  private int numerator, denominator;
  /*Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    this.reduce();
    if (denominator == 0){
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue(){
    return numerator * 1.0 / denominator *1.0;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    if (denominator == 0){
      return new RationalNumber(0, 1);
    }
    int formerN = numerator;
    int newNumerator = denominator;
    int newDenominator = formerN;
    RationalNumber newNum = new RationalNumber(newNumerator, newDenominator);
    return newNum;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return this.getValue() == other.getValue();
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 0){
      return "Denominator of 0: default value is 0/1";
    }//Should never print
    this.reduce();
    if (denominator == 1){
      return numerator + "";
    }
    if (numerator == 0){
      return 0 + "";
    }
    return numerator + "/" + denominator;
  }
  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  //private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    /*a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0 || b == 0 || Math.abs(a-b) == 1){
      return 1;
    }
    if (a < b){
      int formerA = a;
      a = b;
      b = formerA;
    }//Makes the function work for when a<b
    int divisor = a/b;
    int remainder = a - (b*divisor);
    while (divisor != 0){
      divisor = a / b;
      remainder = a - (b * divisor);
      if (remainder == 0){
        return b;
      }
      a = b;
      b = remainder;
    }
    return b;
  } */
  private int gcd(int A, int B) {
    int a = Math.max(Math.abs(A),Math.abs(B));
    int b = Math.min(Math.abs(A),Math.abs(B));
    if (a==0||b==0) {
      return 1;
    }
    while (a%b!=0) {
      int remainder=a%b;
      a=b;
      b=remainder;
    }
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int divisor = gcd(this.getNumerator(), this.getDenominator());
    this.numerator /= divisor;
    this.denominator /= divisor;
    if (this.denominator < 0){
        this.denominator *= -1;
        this.numerator *= -1;
    }
  }

  /******************Operations!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    /*RationalNumber reverse1 = new RationalNumber(this.getNumerator(), other.getDenominator());
    reverse1.reduce();
    RationalNumber reverse2 = new RationalNumber(other.getNumerator(), this.getDenominator());
    reverse2.reduce();
    RationalNumber product = new RationalNumber(reverse1.getNumerator() * reverse2.getNumerator(), reverse1.getDenominator() * reverse2.getDenominator());
    */
    RationalNumber product = new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
    product.reduce();
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
    System.out.println(quotient);
    quotient.reduce();
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int numerator1 = this.getNumerator() * other.getDenominator();
    int numerator2 = other.getNumerator() * this.getDenominator();
    int thisdenominator = this.getDenominator() * other.getDenominator();
    RationalNumber sum = new RationalNumber(numerator1 + numerator2, thisdenominator);
    sum.reduce();
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int numerator1 = this.getNumerator() * other.getDenominator();
    int numerator2 = other.getNumerator() * this.getDenominator();
    int thisdenominator = this.getDenominator() * other.getDenominator();
    RationalNumber difference = new RationalNumber(numerator1 - numerator2, thisdenominator);
    difference.reduce();
    return difference;
  }
}
