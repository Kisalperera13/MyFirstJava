class tvehicle{
    String colour;
    String make;
    int year;
}
public class vehicle{
    public static void main(String [] args){
     tvehicle v1 = new tvehicle();
     v1.colour = "Blue";
     v1.make = "Nissan";
     v1.year = 1999;

        System.out.println("" + v1.colour );
        System.out.println("" + v1.make );
        System.out.println("" + v1.year );


    }

}