import java.util.Scanner;
public class Details {
    public static void main(String[] args) {
        Scanner sDetails = new Scanner(System.in);
        customer Student1 = new customer();
        Student1.fName();
        String firstName = sDetails.next();

        Student1.lname();
        String lastName = sDetails.next();

        Student1.iD();
        int studentId = sDetails.nextInt();

        Student1.age();
        int studentAge = sDetails.nextInt();

    }
}
