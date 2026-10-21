public class NewClass3 {

  public static void show() throws ArithmeticException {
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

  public static void main (String[] args) {
    try {
      System.out.println("inside of try block...");
      show();
    } catch(ArithmeticException e) {
          System.out.println("Exception is " + e);
    }
  }
}
