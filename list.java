import java.util.*;

public class Main {
    public static void main(String[] args) {
      ArrayList<Double> list = new ArrayList<Double>();

      list.add(10.5);
      list.add(1000.555);

      list.add(2581.25);
      list.add(25878.265);

      Iterator t1 = list.iterator();
      while(t1.hasNext()) {
          System.out.println(t1.next());
      }
    }
}
