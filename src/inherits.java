class P
{
    int a= 10;
}

class Q extends P {
    int b= 30;
}
public class inherits extends Q {
    public static void main(String args[]) {
        Q q = new Q ();
        System.out.println("b"+" "+ q.b );
        System.out.println("a"+" "+ q.a );

    }

}










