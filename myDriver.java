public class myDriver{
  public static void main(String[] args){
    RealNumber a = new RealNumber(2.5);
    RealNumber b = new RealNumber(7.5);
    RealNumber zero = new RealNumber(0.0);
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.add(b)); //Should print 10.0
    System.out.println(a.multiply(b));//Should print 18.75
    System.out.println(b.divide(a));//Should print 3.0
    System.out.println(zero.divide(b));//Should print 0.0
    System.out.println(a.divide(zero));//Should print Error
    System.out.println(b.subtract(a));//Should print 5.0

  }
}
