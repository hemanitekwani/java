
class Name {

    int age; // Private is using to hide the data

    public int getAge() { return age; } // getter

    public void setAge(int age)
    {
        this.age = age;
    } // setter
}

class encapsulation2 {
    public static void main(String[] args)
    {

        Name n1 = new Name();

        n1.setAge(19);

        System.out.println("The age of the person is: "
                + n1.getAge());
    }
}