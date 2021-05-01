public class Main {
    public static void main(String[] args) {
        BankAccount vasu= new BankAccount();
        vasu.setAccountNumber(122333434);
        vasu.setBalance(99999);
        vasu.setCustomerEmail("jingalalahuhu@qwertyuiop");
        vasu.setCustomerName("Changu mangu");
        vasu.setCustomerPhone(87655555);
        System.out.println(vasu.getAccountNumber());
        System.out.println(vasu.getBalance());
        System.out.println(vasu.getCustomerEmail());
        System.out.println( vasu.getCustomerName());
        System.out.println(vasu.getCustomerPhone());
        System.out.println(vasu.getClass());
        vasu.withdrawFunds(122);
        vasu.depositFunds(1223343);
        BankAccount cheeku= new BankAccount();
        System.out.println(cheeku.getBalance());

    }
}
