 class Baseclass{
    int x =20;
  void msg() {
      System.out.println("BASE CLASS METHOD");
  }
 }
  class Childclass extends Baseclass {
    int x =50;
    int y = 40;

    void msg() {
        System.out.println("Child Class First Method");
    }
      void msg1() {
          System.out.println("Child Class Second Method");
      }

  }
public class inherit2 {
    public static void main(String args[]) {
        Childclass c1 = new Childclass();
        c1.msg();
        c1.msg1();
    }
}
