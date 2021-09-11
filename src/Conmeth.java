class vehicle{
    String name;
    String model;
    int year;
    public vehicle(String name , String model , int year){
        this.year = year;
        this.model = model;
        this.name = name;
    }
    public void start(){
        System.out.println("Stsrting");
    }
}
public class Conmeth {
    public static void main(String[] args) {
        vehicle v1 = new vehicle("Ford" , "Mustang" , 1999);
            v1.start();
    }
}
