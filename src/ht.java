interface A {
    public abstract void run();
}
 class B implements A {
    public void run() {}
 }
 class MyThread extends B {
    public void run() {
        System.out.println("NPTEL JAVA week 6 new assignment ");
    }
  }


public class ht {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.run();

    }
}
