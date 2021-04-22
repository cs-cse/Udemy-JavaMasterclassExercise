
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        else {
            int a=number,sum=0;
            while(a!=0)
            {

                int last=a%10;
                if(last%2==0)
                    sum=sum+last;
                a=a/10;
            }

            return sum;
            }



    }
}
