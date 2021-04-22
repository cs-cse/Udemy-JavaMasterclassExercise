public class NumberofDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999)
            return false;
        else{
            if(year%4==0 && year%100!=0)
                return true;
            else if(year%100==0 && year%400==0)
                return true;
            else
                return false;



        }

    }


    public static int getDaysInMonth(int month,int year){

        if(month<1 || month>12)
            return -1;
        if(year<1 || year>9999)
            return -1;
        if(isLeapYear(year)) {
            switch (month) {


                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("29");
                    break;
                case 3:
                    System.out.println("31");
                    break;

                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("30");
                    break;
                case 7:
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;
                default:
                    return -1;


            }
        }
            else{

            switch (month) {


                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;

                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("30");
                    break;
                case 7:
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;
                default:
                    return -1;

            }


            }


      return(0);
    }
}
