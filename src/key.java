class animal{
    public void eat() {
        System.out.println("I am all alone");
    }

}
class Dog extends Animal {
    public void eat() {
        super.eat();
        System.out.println("I will die soon");
    }
    public void bark() {
        System.out.println("I Quit");
    }
}
 class key {
     public static void main(String args[]) {

         Dog d1 = new Dog();
         d1.eat();

     }
 }














