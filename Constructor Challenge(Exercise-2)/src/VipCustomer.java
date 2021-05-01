public class VipCustomer {
   private String name;
   private double limit;
   private String emailId;


   public VipCustomer(){
this("xxx",1000.0,"abc@zyx");
       System.out.println("Default Constructor");

   }


    public VipCustomer(String name,double limit){
       this(name,limit,"abc@xyzaaaa");
       System.out.println("2 parameters passed");
   }
    public VipCustomer(String name,double limit,String emailId){
        this.name=name;
        this.limit=limit;
        this.emailId=emailId;
    }

    public String getName() {
        return this.name;
    }

    public double getLimit() {
       return this.limit;
    }

    public String getEmailId() {
        return this.emailId;
    }
}
