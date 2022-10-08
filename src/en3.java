class info {
     private double id;
     String name;
      private  String email;
      private float amount;

      public double getId() {
          return id ;
      }
      public  void  setId(double id) {
          this.id = id;
      }
      public String getName() {
          return (name);
      }
      public void setName(String name) {
          this.name= name;
      }
     public  String getEmail() {
          return(email);
     }
     public  void setEmail(String email) {
          this.email = email;
     }
     public float getAmount(){
          return(amount);
    }
    public void  setAmount(float amount) {
          this.amount = amount;
    }
}
public class en3 {
    public static void main (String[] args) {
        info e = new info();
        e.setId(3214455);
        e.setName("hemani");
        e.setEmail("hher@gmail.com");
        e.setAmount(7800);

        System.out.println(e.getId()+"  "+e.getName()+"  "+e.getEmail()+"  "+e.getAmount());
    }
}
