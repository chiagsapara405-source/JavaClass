public class NewClass2 {

  public static void main (String[] args) {
    int a = 0, b = 0;
    try {
        if (b == 0) {
          throw new ArithmeticException("We cant divide number with 0");
        }
        else {
          System.out.println(a/b);
        }
    } catch(ArithmeticException e) {
        System.out.println(e);
    }
  }
}
