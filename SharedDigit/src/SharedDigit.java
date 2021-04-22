public class SharedDigit {


    public static boolean hasSharedDigit(int a, int b) {

        if (a > 99 || a< 10 || b > 99 || b < 10)
            return false;
        else {
            int digit, digit2;


                digit = a % 10;
                digit2 = b % 10;
                int num1 = a / 10;
                int num2 = b / 10;
                if ((num1 == num2) || (digit == digit2))
                    return true;
                else if ((num1 == digit2) || (num2 == digit))
                    return true;
                else
                    return false;





        }


    }
}
