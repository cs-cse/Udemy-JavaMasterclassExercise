public class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {

        return "Mitsubishi engine started";
    }

    @Override
    public String accelerate() {

        return "Mitsubishi is accelerating ";
    }

    @Override
    public String brake() {

        return "Mitsubishi brakes applied";
    }


}