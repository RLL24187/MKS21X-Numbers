public class RationalNumber{
  //Instance variables
  private int numerator;
  private int denominator;
  //Constructor to make a rational RealNumber given integers
  public RationalNumber(int num, int denom){
    numerator = num;
    denominator = denom;
  }
  //Get variables
  public int getNumerator(){
    return this.numerator;
  }
  public int getDenominator(){
    return this.denominator;
  }
  //toString
  public String toString(){
    return "";
  }
  //LCD fxn
  public RationalNumber convertLCD(RationalNumber num){
    return new RationalNumber(9, 2);
  }
  //Setters and basic operations
  public double add(double num){
    return 1.;
  }
  public double subtract(double num){
  return 1.;
  }
  public double multiply(double num){
    return 1.;
  }
  public double divide(double num){
    return 1.;
  }
  //Comparison functions
  public boolean equals(RationalNumber num){
    return true;
  }
  public boolean greaterThan(RationalNumber num){
    return false;
  }
  //Method that returns a copy of RationalNumber
  public RationalNumber copy(){
    return new RationalNumber(this.numerator, this.denominator);
  }
}
