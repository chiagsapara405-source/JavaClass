import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashSet<Double> s1 = new HashSet<Double>();

      s1.add(10.5);
      s1.add(1000.555);

      s1.add(2581.25);
      s1.add(25878.265);

      Iterator t1 = s1.iterator();
      while(t1.hasNext()) {
          System.out.println(t1.next());
      }
    }
}
