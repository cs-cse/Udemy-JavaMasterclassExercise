public class Main {
    public static void main(String[] args) {
        VipCustomer person1=new VipCustomer();
        System.out.println(person1.getName());
       System.out.println( person1.getLimit());
        System.out.println(person1.getEmailId());

        VipCustomer person2= new VipCustomer("raju",1111.2);
        System.out.println(person2.getName());
        System.out.println( person2.getLimit());
        System.out.println(person2.getEmailId());

        VipCustomer person3=new VipCustomer("jinghur",101010101,"qwe@rty");
        System.out.println(person3.getName());
        System.out.println( person3.getLimit());
        System.out.println(person3.getEmailId());
    }
}
