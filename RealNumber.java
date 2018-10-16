public class RealNumber{
  //Instance variables
  private double val;
  //Constructor for making a real number
  public RealNumber(double num){

  }
  //Get variables
  public double getValue(){
    return this.val;
  }
  //toString
  public String toString(){
    return "";
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
  public boolean equals(double num){
    return true;
  }
  public boolean greaterThan(double num){
    return false;
  }
  //Method that returns a copy of RealNumber
  public RealNumber copy(){
    return new RealNumber(this.val);
  }
}
