class Animal {
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}
 class dog extends Animal {
    public void display() {
        System.out.println("my name is = "+" "+"hemani");
    }
 }
 public class inherit3{
    public static void main(String args[]) {
        dog a1 = new dog();
        a1.display();
        a1.eat();
    }
}





