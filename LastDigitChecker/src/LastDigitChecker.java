public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a,int b,int c){

        if(a>1000 || a<10|| b>1000 || b<10|| c>1000 || c<10)
            return false;
        else
        {
           int  digit1,digit2,digit3;
           digit1=a%10;
           digit2=b%10;
           digit3=c%10;

           if(digit1==digit2 || digit2==digit3 || digit1==digit3)
               return true;

            else return false;
        }


    }
    public static boolean isValid(int a){
        if(a>1000 || a<10)
            return false;
        else return true;
    }

}
