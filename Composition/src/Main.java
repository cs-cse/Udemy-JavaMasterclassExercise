public class Main {
    public static void main(String[] args) {
        Bedroom subZero=new Bedroom("My Room",new Wall("N"),new Wall("S"),new Wall("E"),new Wall("W"),new Ceiling(100,101),
                new Bed("hard",3,19,1,1),new Lamp("Wooden",false,101));

    subZero.makeBed();
    subZero.getLamp().turnOn();
    }
}
