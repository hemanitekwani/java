interface Printable {
    void print();
}
interface Showable {
    void show();
}

class A3 implements Printable,Showable {

    @Override
    public void print() {
        System.out.println("WELCOME!!");
    }

    @Override
    public void show() {
        System.out.println("HELLO");
    }
}

public class multipleinheritance {
    public static void main(String args[]) {
        A3 a = new A3();
        a.print();
        a.show();
    }
}
