public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public void addAddition1(String name,double price) {
        this.addition1Name=name;
        this.addition1Price=price;

    }



    public void addAddition2(String name,double price) {
        this. addition2Name=name;
        this.addition2Price=price;
    }

    public void addAddition3(String name,double price) {
        this.addition3Name=name;
        this.addition3Price=price;
    }

    public void addAddition4(String name,double price) {
        this.addition4Name=name;
        this.addition4Price=price;
    }
public double itemizeHamburger(){
        double hamPrice=this.price;
        if(this.addition1Name!=null){
            hamPrice+=this.addition1Price;
        }
    if(this.addition2Name!=null){
        hamPrice+=this.addition2Price;
    }
    if(this.addition3Name!=null){
        hamPrice+=this.addition3Price;
    }
    if(this.addition4Name!=null){
        hamPrice+=this.addition4Price;
    }
    return hamPrice;
}

}
