
interface First {
    default void show() {
        System.out.println("Default method");
    }
}
interface  Second  {
    default void show() {
        System.out.println("implementation of first");
    }
}

 class uyt implements First,Second {
    public void show() {
        First.super.show();

          Second.super.show();
    }

    public static void main(String args[]) {
        uyt p = new uyt();
        p.show();


        }

    }

