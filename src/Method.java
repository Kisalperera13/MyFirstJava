import java.util.Scanner;
class sDetails {
    Scanner Student = new Scanner(System.in);
    public void sName() {
        System.out.print("Enter Your First Name:");
        String Name = Student.next();
    }
    public void id() {
        System.out.print("Enter Your ID Number:");
        int sId = Student.nextInt();
    }
    public void age() {
        System.out.print("Enter Your Age :");
        String sAge = Student.next();
    }
    public static void comp() {
        System.out.println("================Thanks==================");
    }

}
    public class Method {
     public static void main(String[] args) {
         //Student 001;
         sDetails s1 = new sDetails();
         s1.sName();
         s1.id();
         s1.age();
         s1.comp ();

    }
    public void hH(){
        System.out.println("-------------Hello---------------");
    }

}
