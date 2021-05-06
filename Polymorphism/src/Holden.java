public class Holden extends  Car{
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {

        return "Holden engine started";
    }

    @Override
    public String accelerate() {

        return "Holden is accelerating ";
    }

    @Override
    public String brake() {

        return "Holden brakes applied";
    }


}