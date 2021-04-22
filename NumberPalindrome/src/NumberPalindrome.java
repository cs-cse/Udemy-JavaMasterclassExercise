public class NumberPalindrome {
    public static boolean isPalindrome(int number){

     int  reverse=0;
     int numbera=number;
     while(numbera!=0){

         int lastdigit=numbera%10;

         reverse=reverse*10;
         reverse=reverse+lastdigit;
         numbera /= 10;


     }
     if(reverse==number)
         return true;
     else
         return false;

    }
}
