class First extends Thread {
  public void run() {
      for (int i=1; i<=3; i++) {
          System.out.println("1st Thread: " + i);
      } 
  }
}

class Sec extends Thread {
    public void run() {
      for (int j=1; j<=3; j++) {
          System.out.println("2nd Thread: " + j);
      } 
    }
}
class Thrd extends Thread {
    public void run() {
      for (int k=1; k<=3; k++) {
          System.out.println("3rd Thread: " + k);
      } 
    }
}

class Main {
    public static void main (String[] args) {
      First f = new First();
      Sec s = new Sec();
      Thrd t = new Thrd();

      f.start();
      s.start();
      t.start();
    }
}
