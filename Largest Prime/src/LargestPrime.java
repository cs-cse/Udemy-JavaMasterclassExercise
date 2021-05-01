public class LargestPrime {

    public static int getLargestPrime(int  number){
        int i,j;
        boolean flag = true;
        if(number<2)
            return -1;
        for( i=2;i<number;i++) {
            if (number % i == 0){
                number/=i;
                i--;




            }





        }

return number;



        }








    }

