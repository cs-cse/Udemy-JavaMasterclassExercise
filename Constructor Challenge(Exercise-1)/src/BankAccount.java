public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public BankAccount() {
        this(111111,0.0,"John Doe","abc@xyz",00000);

    }
    public BankAccount(long accountNumber,double balance,String customerName,String customerEmail,int customerPhone){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.customerPhone=customerPhone;

    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }
    public void depositFunds(double deposit){
        balance+=deposit;
        System.out.println("New Balance is = "+ balance);

    }
    public void withdrawFunds(double drawFunds){
        if(balance>drawFunds)
            balance-=drawFunds;
        else
            System.out.println("Insufficient funds");
        System.out.println("Amount Withdrawn = " + drawFunds);
        System.out.println("Balance Left = "+ balance);

    }
}
