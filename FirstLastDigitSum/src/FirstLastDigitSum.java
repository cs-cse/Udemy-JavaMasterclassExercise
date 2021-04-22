public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        int a= number;
        if(number<0)
            return -1;
        else{

            int last=a%10;

            while(a>9)
            {
               a=a/10;



            }

            return a+last;


        }



    }
}
