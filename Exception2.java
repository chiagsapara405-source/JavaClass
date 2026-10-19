import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a = 0, b = 0;

      try {
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        int c = a/b;
        System.out.println(c);
      } catch(Exception e) {
        System.out.println(e);
      }
    }
}
