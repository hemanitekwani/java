interface Printab{
    void print();
}
interface show extends Printab {
    void show();
}
class A1 implements Printab, show {
    public void print() {
        System.out.println("HI Guys!! How are you");
    }

    public void show() {
        System.out.println("I Am here!!");
    }
}

public class interface2 {
    public static void main(String args[]) {
        Printab p1 = new A1 ();
        show s1 = new A1();
        p1.print();
        s1.show();

    }
}
