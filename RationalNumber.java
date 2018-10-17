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
  }

  public double getValue(){
    return numerator / denominator;//???
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
    int formerN = numerator;
    numerator = denominator;
    denominator = formerN;
    RationalNumber newNum = new RationalNumber(numerator, denominator);
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
      RationalNumber fixedNum = new RationalNumber(this.reciprocal().numerator, this.reciprocal().denominator);
      return fixedNum.numerator + "/" + fixedNum.denominator;
    }
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

    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
