public class RationalNumber extends RealNumber{
  //Instance variables
  private int numerator, denominator;

  /*Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (denominator == 0){
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue(){
    return numerator * 1.0 / denominator;
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
    return numerator + "/" + denominator;
  }
  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    if (a < 0){
      a *= -1;
    }
    if (b < 0){
      b *= -1;
    }
    if (a == 0 || b == 0){
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
      //System.out.println(a);
      //System.out.println(b);
      //System.out.println(divisor);
      //System.out.println(remainder);
      a = b;
      b = remainder;
      //System.out.println(a);
      //System.out.println(b);
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
    numerator /= divisor;
    denominator /= divisor;
  }

  /******************Operations!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
    product.reduce();
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
    quotient.reduce();
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    this.numerator = this.getNumerator() * other.getDenominator();
    other.numerator = other.getNumerator() * this.getDenominator();
    this.denominator *= other.getDenominator();
    other.denominator = this.getDenominator();
    RationalNumber sum = new RationalNumber(this.getNumerator() + other.getNumerator(), this.getDenominator());
    sum.reduce();
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    this.numerator = this.getNumerator() * other.getDenominator();
    other.numerator = other.getNumerator() * this.getDenominator();
    this.denominator *= other.getDenominator();
    other.denominator = this.getDenominator();
    RationalNumber difference = new RationalNumber(this.getNumerator() - other.getNumerator(), this.getDenominator());
    difference.reduce();
    return difference;
  }
}
