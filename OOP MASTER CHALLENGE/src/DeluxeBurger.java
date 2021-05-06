public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Basic","White", "Sausage", 14.10);
      super.addAddition1("Chips",2.78);
      super.addAddition2("Drink",2.22);

    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("No extra items can be added");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("No extra items can be added");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("No extra items can be added");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("No extra items can be added");
    }
}
