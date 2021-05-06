public class Car {
    private boolean engine=true;
    private int cylinders;
    private String name;
    private int wheels=4;


    public Car(int cylinder, String name) {


        this.cylinders = cylinder;
        this.name = name;

    }
    public String startEngine(){
        return "Car engine started";
    }
    public String accelerate(){
        return  "Car is accelerating ";
    }
    public String brake(){
        return "Car brakes applied";

    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}


