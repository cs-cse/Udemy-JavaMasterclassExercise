public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", "White", meat, price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;

    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;

    }

    @Override
    public double itemizeHamburger() {
        double hamprice= super.itemizeHamburger();
        if(this.healthyExtra1Name!=null){
            hamprice+=this.healthyExtra1Price;
        }

        if(this.healthyExtra2Name!=null){
            hamprice+=this.healthyExtra2Price;
        }
        return hamprice;
    }
}

